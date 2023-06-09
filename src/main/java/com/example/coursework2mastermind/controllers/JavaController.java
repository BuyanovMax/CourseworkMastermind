package com.example.coursework2mastermind.controllers;



import com.example.coursework2mastermind.QuestionService;
import com.example.coursework2mastermind.essences.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("exam/java")
public class JavaController {


    private final QuestionService questionService;

    public JavaController(@Qualifier("javaQuestionService")QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping(path = "/add")
    public Question addQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/find")
    public Question findQuestion(Question question) {
        return questionService.find(question);
    }
    @GetMapping(path = "/remove")
    public Question removeQuestion(Question question) {
        return questionService.remove(question);
    }
    @GetMapping()
    public Collection<Question> getAllQuestions() {
        return questionService.getAll();
    }
}
