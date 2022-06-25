package com.phuc.validate_music.repository;

import com.phuc.validate_music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
    @Query(value = "select  * from music where id= :id",nativeQuery = true)
    Music findByIdMusic(@Param("id") int id);
}
