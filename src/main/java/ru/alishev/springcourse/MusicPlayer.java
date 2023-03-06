package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music;
    private int volume;
    private String name;

    public void setMusic(Music music) {
        this.music = music;
    }

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){}

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
