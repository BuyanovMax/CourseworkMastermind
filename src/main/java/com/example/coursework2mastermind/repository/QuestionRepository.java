package com.example.coursework2mastermind.repository;

import com.example.coursework2mastermind.essences.Question;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

}
