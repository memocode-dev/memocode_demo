package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
import dev.memocode.memo_server.domain.memo.MemoVersion;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@Table(name = "post_memoversion")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class PostMemoVersion extends BaseEntity {

    @OneToOne(fetch = LAZY)
    @EqualsAndHashCode.Include
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne(fetch = LAZY)
    @EqualsAndHashCode.Include
    @JoinColumn(name = "memo_version_id")
    private MemoVersion memoVersion;
}
