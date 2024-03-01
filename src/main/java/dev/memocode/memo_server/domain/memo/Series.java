package dev.memocode.memo_server.domain.memo;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
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
@Table(name = "series")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Series extends BaseEntity {

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = LAZY)
    private Author author;
}
