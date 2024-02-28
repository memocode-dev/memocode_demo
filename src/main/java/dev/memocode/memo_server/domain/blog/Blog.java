package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.AggregateRoot;
import dev.memocode.memo_server.domain.external.user.entity.Author;
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
@Table(name = "memo_versions")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Blog extends AggregateRoot {

    @Column(name = "introduce")
    private String introduce;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Author blogger;
}
