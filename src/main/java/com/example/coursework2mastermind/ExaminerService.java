package com.example.coursework2mastermind;



import com.example.coursework2mastermind.essences.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
