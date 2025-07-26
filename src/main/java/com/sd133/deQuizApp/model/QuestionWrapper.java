package com.sd133.deQuizApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionWrapper {

    private String id;
    private String body;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
