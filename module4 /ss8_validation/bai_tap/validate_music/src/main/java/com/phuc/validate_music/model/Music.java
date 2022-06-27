package com.phuc.validate_music.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_music")
    private String nameMusic;
    private String singer;
    @ManyToOne
    @JoinColumn(name = "id_type_music",referencedColumnName = "id_type_music")
    private TypeMusic idTypeMusic;

    public Music() {
    }

    public Music(Integer id, String nameMusic, String singer, TypeMusic idTypeMusic) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.singer = singer;
        this.idTypeMusic = idTypeMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TypeMusic getIdTypeMusic() {
        return idTypeMusic;
    }

    public void setIdTypeMusic(TypeMusic idTypeMusic) {
        this.idTypeMusic = idTypeMusic;
    }
}
