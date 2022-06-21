package com.phuc.repository;

import com.phuc.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> getAll();

    void save(Music music);

    Music findById(int idMusic);

    void edit( Music music);

    void delete(Integer idMusic);
}
