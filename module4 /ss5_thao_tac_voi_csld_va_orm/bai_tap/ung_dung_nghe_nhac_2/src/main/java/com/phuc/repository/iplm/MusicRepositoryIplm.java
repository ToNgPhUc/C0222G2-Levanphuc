package com.phuc.repository.iplm;

import com.phuc.model.Music;
import com.phuc.repository.BaseRepository;
import com.phuc.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MusicRepositoryIplm implements IMusicRepository {
    @Override
    public List<Music> getAll() {
        TypedQuery<Music> typedQuery =
                BaseRepository.entityManager.createQuery("select music from Music music", Music.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            BaseRepository.entityManager.persist(music);
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public Music findById(int idMusic) {

//        cach1
//        TypedQuery<Music> typedQuery =
//        BaseRepository.entityManager.createQuery
//                ("select m from Music m where m.idMusic=:idMusic ",Music.class);
//        typedQuery.setParameter("music",idMusic);
//        return typedQuery.getSingleResult();

        return BaseRepository.entityManager.find(Music.class, idMusic);
    }

    @Override
    public void edit(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            BaseRepository.entityManager.merge(music);
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void delete(Integer idMusic) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            BaseRepository.entityManager.remove(BaseRepository.entityManager.find(Music.class,idMusic));            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }
}
