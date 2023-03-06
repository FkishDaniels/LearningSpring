package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        firstMusicPlayer.setVolume(80);
        firstMusicPlayer.setMusic(context.getBean("ClassicalMusic",ClassicalMusic.class));
        boolean comprassion = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comprassion);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        context.close();
    }
}
