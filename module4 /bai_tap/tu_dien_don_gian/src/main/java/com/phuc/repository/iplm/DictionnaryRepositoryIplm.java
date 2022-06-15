package com.phuc.repository.iplm;

import com.phuc.repository.IDictionnaryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionnaryRepositoryIplm implements IDictionnaryRepository {
    private static Map<String, String> dictionaryMap = new HashMap<>();

    static {
        dictionaryMap.put("おはようございます","chào buổi sáng" );
        dictionaryMap.put("こんにちは","chào buổi trưa" );
        dictionaryMap.put("こんばんは","chào buổi tối" );
    }

    @Override
    public String convert(String 日本語) {
        for (String str : dictionaryMap.keySet())
            if (str.equals(日本語)){
                return dictionaryMap.get(str);
            }
        return null;
    }
}
