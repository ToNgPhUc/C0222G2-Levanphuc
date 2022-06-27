package com.phuc.validate_music.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_music")
    private Integer idTypeMusic;
    @Column(name = "kind_of_music")
    private String kindOfMusic;
    @OneToMany(mappedBy = "idTypeMusic")
    List<Music>musicList;

    public TypeMusic() {
    }

    public TypeMusic(Integer idTypeMusic, String kindOfMusic, List<Music> musicList) {
        this.idTypeMusic = idTypeMusic;
        this.kindOfMusic = kindOfMusic;
        this.musicList = musicList;
    }

    public Integer getIdTypeMusic() {
        return idTypeMusic;
    }

    public void setIdTypeMusic(Integer idTypeMusic) {
        this.idTypeMusic = idTypeMusic;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
