package com.phuc.service.iplm;

import com.phuc.repository.IDictionnaryRepository;
import com.phuc.service.IDictionnaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionnaryServiceIplm implements IDictionnaryService {
    @Autowired
    IDictionnaryRepository iDictionnaryRepository;
    public String convert(String 日本語){
        return iDictionnaryRepository.convert(日本語);
    }
}
