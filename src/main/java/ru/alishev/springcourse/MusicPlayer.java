package ru.alishev.springcourse;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int Volume;

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    //IoC
    public MusicPlayer(List<Music> music){
        this.music = music;
    }
    public MusicPlayer(){}

    public void playMusic(){
        for (Music mu:music
             ) {
            System.out.println(mu.getSong());
        }
        System.out.println("On player: "+getName());
        System.out.println("Volume: "+getVolume());
    }
}
