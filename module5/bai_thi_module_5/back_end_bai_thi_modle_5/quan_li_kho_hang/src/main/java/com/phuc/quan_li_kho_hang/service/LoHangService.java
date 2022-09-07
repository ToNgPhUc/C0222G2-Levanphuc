package com.phuc.quan_li_kho_hang.service;

import com.phuc.quan_li_kho_hang.model.LoHang;
import com.phuc.quan_li_kho_hang.repository.IloHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoHangService implements ILoHangService{
    @Autowired
    private IloHangRepository iloHangRepository;
    @Override
    public List<LoHang> getAllLoHang() {
        return this.iloHangRepository.findAll();
    }

    @Override
    public LoHang save(LoHang loHang) {
        return iloHangRepository.save(loHang);
    }

    @Override
    public Optional<LoHang> findById(int id) {
        return iloHangRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        this.iloHangRepository.deleteById(id);
    }

    @Override
    public Page<LoHang> findAll(Pageable pageable) {
        return this.iloHangRepository.findAll(pageable);
    }

    @Override
    public Page<LoHang> findAllByName(String searchName,String ngayNhapHangSearch, Pageable pageable) {
        return this.iloHangRepository.findAllByName("%"+searchName+"%","%"+ngayNhapHangSearch+"%",pageable);
    }


}
