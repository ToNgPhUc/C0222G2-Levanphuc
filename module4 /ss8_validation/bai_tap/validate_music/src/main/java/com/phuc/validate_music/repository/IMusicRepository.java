package com.phuc.validate_music.repository;

import com.phuc.validate_music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
    @Query(value = "select  * from music where id= :id",nativeQuery = true)
    Music findByIdMusic(@Param("id") int id);

@Query(value = "select  * from music where name_music like :searchType",nativeQuery = true,
countQuery = "select count(*) from (select  * from music where name_music like :searchType)temp_table")
    Page<Music> findByTyMusic(@Param("searchType") String searchType, Pageable pageable);
}
