package dev.memocode.memo_server.domain.memo;

import dev.memocode.memo_server.domain.base.entity.AggregateRoot;
import dev.memocode.memo_server.domain.external.user.entity.Author;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@Table(name = "comments")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Comment extends AggregateRoot {

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "memo_id")
    private Memo memo;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = LAZY)
    private Author author;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_comment_id")
    private Comment parentComment;

    @OneToMany(mappedBy = "parentComment")
    private List<Comment> childMemoComments = new ArrayList<>();
}
