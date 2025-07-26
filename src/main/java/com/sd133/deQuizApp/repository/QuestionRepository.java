package com.sd133.deQuizApp.repository;

import com.sd133.deQuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {
    List<Question> getQuestionByCategory(@Param("category") String category);

    @Query(value = "SELECT * FROM question_details ques WHERE ques.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Question> getRandomQuestionByCategory(@Param("numQ") int numQ,@Param("category") String category);
}
