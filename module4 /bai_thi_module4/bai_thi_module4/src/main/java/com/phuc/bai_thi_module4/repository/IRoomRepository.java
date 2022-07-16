package com.phuc.bai_thi_module4.repository;

import com.phuc.bai_thi_module4.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<Room,Integer> {
}
