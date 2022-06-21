package com.phuc.service;

import com.phuc.model.Music;

import java.util.List;

public interface IMusicService {

    List<Music> getAll();

    void save(Music music);

    Music findById(int idMusic);

    void edit(Music music);


    void delete(Integer idMusic);
}
