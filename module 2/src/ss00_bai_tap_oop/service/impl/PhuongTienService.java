package ss00_bai_tap_oop.service.impl;

import ss00_bai_tap_oop.model.PhuongTien;
import ss00_bai_tap_oop.model.XeTai;
import ss00_bai_tap_oop.service.IPhuongTienService;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienService implements IPhuongTienService  {
    public static List<PhuongTien> phuongTiens = new ArrayList<>();

    public static List<PhuongTien> getPhuongTiens() {
        return phuongTiens;
    }


    static {
        phuongTiens.addAll(XeTaiService.getXeTaiList());
        phuongTiens.addAll(XeOtoService.getXeOtoList());
        phuongTiens.addAll(XeMayService.getXeMayList());
    }


    @Override
    public void themPhuongTien() {

    }

    @Override
    public void hienThiPhuongTien() {
        for (PhuongTien phuongTien :phuongTiens) {
            System.out.println(phuongTien);
        }
    }

    @Override
    public void xoaPhuongTien() {

    }

    @Override
    public void timKiemPhuongTien() {

    }
}
