package com.sd133.deQuizApp.repository;

import com.sd133.deQuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {
    List<Question> getQuestionByCategory(@Param("category") String category);
}
