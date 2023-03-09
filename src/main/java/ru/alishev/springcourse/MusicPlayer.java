package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Player")
public class MusicPlayer {
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
