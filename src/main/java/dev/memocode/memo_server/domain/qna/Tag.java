package dev.memocode.memo_server.domain.qna;

import dev.memocode.memo_server.domain.base.entity.AggregateRoot;
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
@Table(name = "tags")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class Tag extends AggregateRoot {

    @Column(name = "name", unique = true)
    @EqualsAndHashCode.Include
    private String name;
}
