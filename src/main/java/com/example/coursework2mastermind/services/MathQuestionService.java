package com.example.coursework2mastermind.services;


import com.example.coursework2mastermind.QuestionService;
import com.example.coursework2mastermind.essences.Question;
import com.example.coursework2mastermind.exceptions.MethodNotAllowedException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
@Component
public class MathQuestionService implements QuestionService {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<String> list3 = new ArrayList<>();
    List<String> list4 = new ArrayList<>();
@PostConstruct
public void init() {

    list.add("товарищи!");
    list.add("с другой стороны");
    list.add("равным образом!");
    list.add("таким образом");
    list.add("повседневная практика показывает!");
    list.add("разнообразный и богатый опыт!");


    list2.add("реализация намеченных плановых заданий");
    list2.add("рамки и место обучения кадров");
    list2.add("сложившаяся структура организации!");
    list2.add("новая модель организационной деятельности");
    list2.add("дальнейшее развитие различных важных форм деятельности");
    list2.add("укрепления и развития структуры");


    list3.add("играет важную роль в формировании");
    list3.add("требуют от нас анализа");
    list3.add("требуют определения и уточнения");
    list3.add("позволяет выполнить важные задания по разработке");
    list3.add("в значительной степени обуславливает создание");
    list3.add("позволяет оценить значение");


    list4.add("существующих финансовых и административных условий");
    list4.add("дальнейших направлений развития");
    list4.add("системы массового участия");
    list4.add("позиций, занимаемых участниками в отношении поставленных задач");
    list4.add("новых предложений");
    list4.add("направлений прогрессивного развития");
}
    Random random = new Random();

    @Override
    public Question add(String question, String answer) {
       throw new MethodNotAllowedException("Method Not Allowed");
    }


    public Question find(Question question) {
        throw new MethodNotAllowedException("Method Not Allowed");
    }

    @Override
    public Question remove(Question question) {
        throw new MethodNotAllowedException("Method Not Allowed");
    }

    @Override
    public Collection<Question> getAll() {
        throw new MethodNotAllowedException("Method Not Allowed");
    }


    @Override
    public Question getRandomQuestion() {
        List<String> listWords = new ArrayList<>();
        int a = random.nextInt(0, list.size());
        int b = random.nextInt(0, list2.size());
        int c = random.nextInt(0, list3.size());
        int d = random.nextInt(0, list4.size());
        listWords.add(list.get(a));
        listWords.add(list.get(b));
        listWords.add(list.get(c));
        listWords.add(list.get(d));
        Question question = new Question(listWords.get(0) + listWords.get(1), listWords.get(2) + listWords.get(3));


        return question;
    }

}


