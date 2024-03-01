package dev.memocode.memo_server.api.spec;

import dev.memocode.memo_server.dto.MemoCreateForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.Jwt;

@Tag(name = "memos", description = "메모 API")
@SecurityRequirement(name = "bearer-key")
public interface MemoApi {

    @Operation(summary = "메모 생성")
    ResponseEntity<Void> createMemo(MemoCreateForm form, Jwt jwt);
}
