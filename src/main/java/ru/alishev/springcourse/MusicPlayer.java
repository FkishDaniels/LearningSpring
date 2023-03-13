package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Player")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Autowired
    @Qualifier("ClassicMusic")
    private Music classic;
    @Autowired
    @Qualifier("RockMusic")
    private Music rock;

    public String playMusic(Checker enumeration){

        String str = "";
        if(enumeration == Checker.CLASSIC){

            str  = classic.getSong();
        }
        if(enumeration == Checker.ROCK){

           str =  rock.getSong();
        }
        return str;
    }


}
