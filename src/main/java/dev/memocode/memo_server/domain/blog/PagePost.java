package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
@Table(name = "page_post")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class PagePost extends BaseEntity {

    @OneToOne(fetch = LAZY)
    private Page page;

    @OneToOne(fetch = LAZY)
    private Post post;
}
