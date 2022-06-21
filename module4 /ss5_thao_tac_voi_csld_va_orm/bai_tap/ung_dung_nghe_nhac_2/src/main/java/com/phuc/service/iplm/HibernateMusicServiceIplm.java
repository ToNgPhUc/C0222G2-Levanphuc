package com.phuc.service.iplm;

import com.phuc.model.Music;
import com.phuc.repository.IMusicRepository;
import com.phuc.service.IMusicService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HibernateMusicServiceIplm implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Music> getAll() {
   return iMusicRepository.getAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(int idMusic) {
        return iMusicRepository.findById(idMusic);
    }

    @Override
    public void edit(Music music) {
        iMusicRepository.edit(music);
    }

    @Override
    public void delete(Integer idMusic) {
        iMusicRepository.delete(idMusic);
    }
}
