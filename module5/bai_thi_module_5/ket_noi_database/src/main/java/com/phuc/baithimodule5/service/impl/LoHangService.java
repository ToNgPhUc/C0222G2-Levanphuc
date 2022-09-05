package com.phuc.baithimodule5.service;


import com.phuc.baithimodule5.model.LoHang;
import com.phuc.baithimodule5.repository.ILoHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoHangService implements ILoHangService {
    @Autowired
    private ILoHangRepository iLoHangRepository;



}
