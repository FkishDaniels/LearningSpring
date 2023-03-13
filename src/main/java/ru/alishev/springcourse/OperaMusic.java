package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class OperaMusic implements Music{
    private List<String> classicList = new ArrayList<>();

    public OperaMusic(){
        classicList.add("Opera1");
        classicList.add("Opera2");
        classicList.add("Opera3");
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
