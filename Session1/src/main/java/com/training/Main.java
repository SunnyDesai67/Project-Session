package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ScoreBoard score = (ScoreBoard) context.getBean("c1");

        ScoreBoard score1 = (ScoreBoard) context.getBean("c2");
        System.out.println(score1.KitGranted());






    }
}