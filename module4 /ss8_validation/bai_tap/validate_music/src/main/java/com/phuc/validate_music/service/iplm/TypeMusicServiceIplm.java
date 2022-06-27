package com.phuc.validate_music.service.iplm;

import com.phuc.validate_music.model.TypeMusic;
import com.phuc.validate_music.repository.IMusicRepository;
import com.phuc.validate_music.repository.ITypeMusicRepository;
import com.phuc.validate_music.service.ITypeMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMusicServiceIplm implements ITypeMusicService {
    @Autowired
    private ITypeMusicRepository iTypeMusicRepository;
    @Override
    public List<TypeMusic> findAll() {
        return this.iTypeMusicRepository.findAll();
    }
}
