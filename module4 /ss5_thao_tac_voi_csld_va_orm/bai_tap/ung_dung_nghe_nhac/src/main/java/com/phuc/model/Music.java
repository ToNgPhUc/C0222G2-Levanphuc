package com.phuc.model;

import javax.persistence.*;

@Entity
@Table
public class Music {

    private String name;
    private String singer;
    private String kindOfMusic;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String file;

    public Music() {
    }

    public Music(String name, String singer, String kindOfMusic, String file) {
        this.name = name;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", kindOfMusic='" + kindOfMusic + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
