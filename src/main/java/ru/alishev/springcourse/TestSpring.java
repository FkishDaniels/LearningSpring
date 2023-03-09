package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("Player",MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(Checker.ROCK));

        context.close();
    }
}
