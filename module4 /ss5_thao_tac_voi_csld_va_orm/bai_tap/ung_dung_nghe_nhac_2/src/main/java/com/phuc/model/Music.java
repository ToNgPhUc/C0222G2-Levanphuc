package com.phuc.model;

import javax.persistence.*;

@Entity
@Table
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_music")
    private Integer idMusic;

    @Column(name = "name_music")
    private String nameMusic;

    @Column(name = "singer_music")
    private String singerMusic;

    @Column(name = "kind_of_music")
    private String kindOfMusic;

    @Column(name = "file_music")
    private String fileMusic;

    public Music() {
    }

    public Music(Integer idMusic, String nameMusic, String singerMusic, String kindOfMusic, String fileMusic) {
        this.idMusic = idMusic;
        this.nameMusic = nameMusic;
        this.singerMusic = singerMusic;
        this.kindOfMusic = kindOfMusic;
        this.fileMusic = fileMusic;
    }

    public Integer getIdMusic() {
        return idMusic;
    }

    public void setIdMusic(Integer idMusic) {
        this.idMusic = idMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getSingerMusic() {
        return singerMusic;
    }

    public void setSingerMusic(String singerMusic) {
        this.singerMusic = singerMusic;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getFileMusic() {
        return fileMusic;
    }

    public void setFileMusic(String fileMusic) {
        this.fileMusic = fileMusic;
    }

    @Override
    public String toString() {
        return "Music{" +
                "idMusic=" + idMusic +
                ", nameMusic='" + nameMusic + '\'' +
                ", singerMusic='" + singerMusic + '\'' +
                ", kindOfMusic='" + kindOfMusic + '\'' +
                ", fileMusic='" + fileMusic + '\'' +
                '}';
    }
}
