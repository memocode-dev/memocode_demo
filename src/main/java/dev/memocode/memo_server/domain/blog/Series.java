package dev.memocode.memo_server.domain.blog;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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
}
