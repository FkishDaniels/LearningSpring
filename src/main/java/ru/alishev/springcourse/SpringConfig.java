package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public OperaMusic operaMusic(){
        return new OperaMusic();
    }
    @Bean
    public List<Music> getMusic(){
        List<Music> list= new ArrayList<>();
        list.add(rockMusic());
        list.add(classicalMusic());
        list.add(operaMusic());
        return list;
    }

    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(getMusic());
    }

}
