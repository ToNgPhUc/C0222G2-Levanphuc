package com.phuc.bai_thi_module4.service;

import com.phuc.bai_thi_module4.model.Contract;
import com.phuc.bai_thi_module4.model.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findAllByName(String keywordVal, Pageable pageable);

    void save(Contract contract);

    void delete(int id);

}
