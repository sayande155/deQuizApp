package com.sd133.deQuizApp.controller;

import com.sd133.deQuizApp.model.QuizResponse;
import com.sd133.deQuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<?> createQuiz(@RequestParam(name = "category") String category, @RequestParam(name="numQ") int numQ, @RequestParam(name = "title") String title){
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<?> getQuiz(@PathVariable int id){
        return quizService.getQuiz(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<?> getScore(@PathVariable int id, @RequestBody List<QuizResponse> responses){
        return quizService.getScore(id, responses);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteQuiz(@PathVariable int id){
        return quizService.deleteQuiz(id);
    }

}
