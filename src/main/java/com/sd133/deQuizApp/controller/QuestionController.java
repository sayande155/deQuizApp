package com.sd133.deQuizApp.controller;


import com.sd133.deQuizApp.model.Question;
import com.sd133.deQuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("add-question")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        Question q = questionService.addQuestion(question);
        if (q != null) {
            return new ResponseEntity<>("Question Added Successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Add Question Failed", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("all-questions")
    public ResponseEntity<?> getQuestionsByCategory(@RequestParam(required = false) String category) {
        List<Question> questions;

        if (category != null && !category.isEmpty()) {
            questions = questionService.getQuestionsByCategory(category);
        } else {
            questions = questionService.getAllQuestions();
        }

        if (questions.isEmpty()) {
            return new ResponseEntity<>("No questions available", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @PutMapping("update-question")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question) {
        Question q = questionService.updateQuestion(question);
        if (q != null) {
            return new ResponseEntity<>("Question Updated Successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Update Question Failed", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("delete-question/{id}")
    public ResponseEntity<String> deleteQuestionById(@PathVariable String id) {
        String msg = questionService.deleteQuestionById(id);
        if (msg.equals("Question Deleted Successfully")) {
            return new ResponseEntity<>("Question Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Question Not Exists", HttpStatus.NOT_FOUND);
        }
    }

}
