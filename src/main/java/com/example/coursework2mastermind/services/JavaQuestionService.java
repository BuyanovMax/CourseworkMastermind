package com.example.coursework2mastermind.services;



import com.example.coursework2mastermind.ExaminerService;
import com.example.coursework2mastermind.QuestionService;
import com.example.coursework2mastermind.essences.JavaQuestionsRepository;
import com.example.coursework2mastermind.essences.Question;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


@Service
@Component
public class JavaQuestionService implements QuestionService {

    Random random = new Random();
    private final JavaQuestionsRepository javaQuestionsRepository;



    public JavaQuestionService(JavaQuestionsRepository javaQuestionsRepository) {
        this.javaQuestionsRepository = javaQuestionsRepository;

    }

    @Override
    public Question add(String question, String answer) {
        return javaQuestionsRepository.add(question, answer);
    }

    @Override
    public Question find(Question question) {
        return javaQuestionsRepository.find(question);
    }

    @Override
    public Question remove(Question question) {
        return javaQuestionsRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestionsRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
       List<Question> list =  javaQuestionsRepository.getAll().stream().collect(Collectors.toList());
        int a = random.nextInt(0, javaQuestionsRepository.getAll().size());
        return list.get(a);
    }




}
