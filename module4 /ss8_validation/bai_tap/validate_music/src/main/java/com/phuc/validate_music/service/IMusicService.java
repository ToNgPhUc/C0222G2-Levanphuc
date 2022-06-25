package com.phuc.validate_music.service;

import com.phuc.validate_music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findByIdMusic(int id);
}
