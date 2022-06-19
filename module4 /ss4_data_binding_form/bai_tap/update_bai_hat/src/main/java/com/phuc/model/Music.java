package com.phuc.model;

public class Music {
    private String nameMusic;
    private String singer;
    private String kindOfMusic;
    private String filePath;

    public Music() {
    }

    public Music(String nameMusic, String singer, String kindOfMusic, String filePath) {
        this.nameMusic = nameMusic;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
        this.filePath = filePath;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
