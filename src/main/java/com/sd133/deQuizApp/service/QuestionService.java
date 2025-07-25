package com.sd133.deQuizApp.service;

import com.sd133.deQuizApp.model.Question;
import com.sd133.deQuizApp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question addQuestion(Question question) {
        try {
            if (!questionRepository.existsById(question.getQuestionId())) {
                return questionRepository.save(question);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.getQuestionByCategory(category);
    }

    public Question updateQuestion(Question question) {
        try {
            if (questionRepository.existsById(question.getQuestionId())) {
                return questionRepository.save(question);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    public String deleteQuestionById(String id) {
        try {
            Question question = questionRepository.getReferenceById(id);
            questionRepository.delete(question);
            return "Question Deleted Successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Question Not Found";
        }
    }
}
