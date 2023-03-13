package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("ClassicMusic")

public class ClassicalMusic implements Music{
    private List<String> classicList = new ArrayList<>();
    @Autowired
    public ClassicalMusic(){
        classicList.add("Class1");
        classicList.add("Class2");
        classicList.add("Class3");
    }


    @Override
    public String getSong() {
        String str = "";
        for(int i = 0;i<classicList.size();i++){
            str+=" "+ classicList.get(i);
        }
        return str;
    }
}
