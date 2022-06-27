package com.phuc.validate_music.service.iplm;

import com.phuc.validate_music.model.Music;
import com.phuc.validate_music.repository.IMusicRepository;
import com.phuc.validate_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMusicServiceIplm implements IMusicService {
@Autowired
private IMusicRepository iMusicRepository;

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        this.iMusicRepository.save(music);
    }

    @Override
    public Music findByIdMusic(int id) {
        return this.iMusicRepository.findByIdMusic(id);
    }

    @Override
    public Page<Music> findByTyMusic(String searchType, Pageable pageable) {
        return this.iMusicRepository.findByTyMusic("%"+searchType+"%",pageable);
    }
}
