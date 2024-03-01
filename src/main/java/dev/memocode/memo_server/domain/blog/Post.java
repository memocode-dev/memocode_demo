package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.AggregateRoot;
import dev.memocode.memo_server.domain.external.user.entity.Author;
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
@Table(name = "posts")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Post extends AggregateRoot {

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "affinity")
    private Long affinity; // 좋아요

    @ManyToOne(fetch = LAZY)
    private Author author;
}
