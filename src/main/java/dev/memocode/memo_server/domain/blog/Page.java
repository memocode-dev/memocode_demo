package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
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
@Table(name = "series")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Page extends BaseEntity {

    @ManyToOne(fetch = LAZY)
    private Series series;

    private String content;
}
