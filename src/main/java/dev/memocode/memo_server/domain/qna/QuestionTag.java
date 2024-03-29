package dev.memocode.memo_server.domain.qna;

import dev.memocode.memo_server.domain.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
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
@Table(name = "question_tag")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class QuestionTag extends BaseEntity {

    @ManyToOne(fetch = LAZY)
    @EqualsAndHashCode.Include
    private Tag tag;

    @ManyToOne(fetch = LAZY)
    @EqualsAndHashCode.Include
    private Question question;
}
