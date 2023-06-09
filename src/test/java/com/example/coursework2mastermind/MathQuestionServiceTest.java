package com.example.coursework2mastermind;


import com.example.coursework2mastermind.essences.Question;
import com.example.coursework2mastermind.exceptions.MethodNotAllowedException;
import com.example.coursework2mastermind.exceptions.QuestionNotFoundException;
import com.example.coursework2mastermind.services.MathQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathQuestionServiceTest {

    public static final String QUESTION1 = "Question111";
    public static final String QUESTION2 = "Question211";
    public static final String QUESTION3 = "Question311";
    public static final String QUESTION7 = "Question7";

    public static final String ANSWER4 = "Answer4";
    public static final String ANSWER5 = "Answer5";
    public static final String ANSWER6 = "Answer6";
    public static final Question NOTFOUNDQUESTION = new Question("Question50", "Answer50");
    public static final Question QUESTION4 = new Question(QUESTION1, ANSWER4);
    public static final Question QUESTION5 = new Question(QUESTION2, ANSWER5);
    public static final Question QUESTION6 = new Question(QUESTION3, ANSWER6);

    private MathQuestionService mathQuestionService = new MathQuestionService();



    @Test
    public void addTest() {
        assertThrows(MethodNotAllowedException.class, () -> mathQuestionService.add(QUESTION7, ANSWER4));
    }

    @Test
    public void findTest() {
        assertThrows(MethodNotAllowedException.class, () -> mathQuestionService.find(NOTFOUNDQUESTION));
    }

    @Test
    public void removeTest() {
        assertThrows(MethodNotAllowedException.class, () -> mathQuestionService.remove(NOTFOUNDQUESTION));
    }


    @Test
    public void getAllTest() {
        assertThrows(MethodNotAllowedException.class, () -> mathQuestionService.getAll());
    }

}
