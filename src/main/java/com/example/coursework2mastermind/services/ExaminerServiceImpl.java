package com.example.coursework2mastermind.services;


import com.example.coursework2mastermind.ExaminerService;
import com.example.coursework2mastermind.QuestionService;
import com.example.coursework2mastermind.essences.JavaQuestionsRepository;
import com.example.coursework2mastermind.essences.Question;
import com.example.coursework2mastermind.exceptions.ChooseFewerQuestionsException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Component
public class ExaminerServiceImpl implements ExaminerService {

    private List<QuestionService> collection = new ArrayList<>();


    public ExaminerServiceImpl(@Qualifier("javaQuestionService") JavaQuestionService javaQuestionService,
                               MathQuestionService mathQuestionService) {
        this.collection.add(javaQuestionService);
        this.collection.add(mathQuestionService);

    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        Set<Question> set = new HashSet<>();
        Collection<Question> list = collection.get(0).getAll();

        if (amount > list.size() * 2) {
            throw new ChooseFewerQuestionsException("choose fewer questions");
        }

        int ii = 0;
        while (ii < amount) {

            for (int j = 0; j < 2; j++) {
                Question question = collection.get(j).getRandomQuestion();
                if (!set.contains(question)) {
                    set.add(question);
                    ii += 1;
                }

            }


        }
        return set;


    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExaminerServiceImpl that = (ExaminerServiceImpl) o;
        return Objects.equals(collection, that.collection) && Objects.equals(collection, that.collection);

    }

    @Override
    public int hashCode () {
        return Objects.hash(collection, collection);
    }
}
