package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

/**
 * 블로그
 * 메모
 */
@Getter
@Entity
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@Table(name = "pages")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Page extends BaseEntity {

    @ManyToOne(fetch = LAZY)
    private Series series;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_page_id")
    private Page parentPage;

    @OneToMany(fetch = LAZY)
    private Set<Page> childPages = new HashSet<>();

    private int order;
}
