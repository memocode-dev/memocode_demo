package dev.memocode.memo_server.api;

import dev.memocode.memo_server.api.spec.MemoApi;
import dev.memocode.memo_server.dto.MemoCreateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memos")
public class MemoController implements MemoApi {

    @PostMapping
    public ResponseEntity<Void> createMemo(@RequestBody MemoCreateForm form, @AuthenticationPrincipal Jwt jwt) {
        return ResponseEntity.created(null).build();
    }
}
