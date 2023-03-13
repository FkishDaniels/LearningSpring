package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    private List<String> rockMusics = new ArrayList<>();

    public RockMusic(){
        rockMusics.add("Rock1");
        rockMusics.add("Rock2");
        rockMusics.add("Rock3");
    }
    @Override
    public String getSong() {
        String str = "";
        for(int i = 0;i<rockMusics.size();i++){
            str = str +" "+ rockMusics.get(i);
        }
        return str;
    }
}
