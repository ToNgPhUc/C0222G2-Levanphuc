package com.phuc.bai_thi_module4.service.iplm;

import com.phuc.bai_thi_module4.model.Room;
import com.phuc.bai_thi_module4.repository.IRoomRepository;
import com.phuc.bai_thi_module4.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoomServiceIplm implements IRoomService {
    @Autowired
    private IRoomRepository iRoomRepository;

    @Override
    public List<Room> findAll() {
        return iRoomRepository.findAll();
    }
}

