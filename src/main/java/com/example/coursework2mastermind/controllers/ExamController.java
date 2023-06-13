package com.example.coursework2mastermind.controllers;



import com.example.coursework2mastermind.ExaminerService;
import com.example.coursework2mastermind.essences.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("exam/java")

public class ExamController {


    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }


    @GetMapping(path = "/getQuestions")
    Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }


}
