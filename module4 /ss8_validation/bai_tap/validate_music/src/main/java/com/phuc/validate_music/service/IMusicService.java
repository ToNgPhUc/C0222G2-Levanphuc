package com.phuc.validate_music.service;

import com.phuc.validate_music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findByIdMusic(int id);

    Page<Music> findByTyMusic(String searchType, Pageable pageable);
}
