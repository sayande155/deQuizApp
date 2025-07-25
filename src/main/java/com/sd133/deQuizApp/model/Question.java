package com.sd133.deQuizApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QuestionDetails")
public class Question {

    @Id()
    @Column(name = "id", nullable = false)
    private String questionId;

    @Column(name = "body", nullable = false)
    private String questionBody;

    @Column(name = "op1", nullable = false)
    private String option1;

    @Column(name = "op2", nullable = false)
    private String option2;

    @Column(name = "op3", nullable = false)
    private String option3;

    @Column(name = "op4", nullable = false)
    private String option4;

    @Column(name = "correctOp", nullable = false)
    private String correctOption;

    @Column(name = "category", nullable = false)
    private String category;

}
