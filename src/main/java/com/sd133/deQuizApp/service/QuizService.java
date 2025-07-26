package com.sd133.deQuizApp.service;

import com.sd133.deQuizApp.model.Question;
import com.sd133.deQuizApp.model.QuestionWrapper;
import com.sd133.deQuizApp.model.Quiz;
import com.sd133.deQuizApp.model.QuizResponse;
import com.sd133.deQuizApp.repository.QuestionRepository;
import com.sd133.deQuizApp.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public ResponseEntity<?> createQuiz(String category, int numQ, String title) {

        List<Question> questions = questionRepository.getRandomQuestionByCategory(numQ, category);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quiz = quizRepository.save(quiz);

        int id = quiz.getId();

        if (id != 0) return new ResponseEntity<>(id, HttpStatus.CREATED);
        else return new ResponseEntity<>("Quiz Creation Failed", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<?> getQuiz(int id) {
        Optional<Quiz> quizOptional = quizRepository.findById(id);
        if (quizOptional.isEmpty()) {
            return new ResponseEntity<>("Quiz doesn't exist", HttpStatus.NOT_FOUND);
        }

        Quiz quiz = quizOptional.get();

        List<Question> questionsInQuiz = quiz.getQuestions();
        List<QuestionWrapper> questionsForClient = new ArrayList<>();

        for (Question q : questionsInQuiz) {
            questionsForClient.add(new QuestionWrapper(q.getQuestionId(), q.getQuestionBody(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4()));
        }

        return new ResponseEntity<>(questionsForClient, HttpStatus.OK);
    }

    public ResponseEntity<?> getScore(int id, List<QuizResponse> responses) {
        Optional<Quiz> quizOptional = quizRepository.findById(id);
        if(quizOptional.isEmpty()){
            return new ResponseEntity<>("Invalid Quiz Id", HttpStatus.NOT_FOUND);
        }

        Quiz quiz = quizOptional.get();
        List<Question> questionList = quiz.getQuestions();

        int correct = 0;

        for(int i = 0; i < questionList.size(); i++){
            if(questionList.get(i).getCorrectOption().equals(responses.get(i).getResponse())){
                correct++;
            }
        }

        return new ResponseEntity<>("Correct : " + correct, HttpStatus.OK);
    }

    public ResponseEntity<?> deleteQuiz(int id) {
        if(quizRepository.existsById(id)){
            quizRepository.deleteById(id);
            return new ResponseEntity<>("Quiz deletion successful", HttpStatus.OK);
        }
        return new ResponseEntity<>("Quiz not found", HttpStatus.NOT_FOUND);
    }
}
