package quan_li_phuong_tien.service.impl;

import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeMay;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeOto;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFileXeTai;
import quan_li_phuong_tien.common.read_writer.ReadWriterToFilephuongTien;
import quan_li_phuong_tien.model.PhuongTien;
import quan_li_phuong_tien.model.XeMay;
import quan_li_phuong_tien.model.XeOto;
import quan_li_phuong_tien.model.XeTai;
import quan_li_phuong_tien.service.IPhuongTienService;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienService implements IPhuongTienService {
    public static List<PhuongTien> phuongTienList = new ArrayList<>();
    ReadWriterToFileXeMay readWriterToFileXeMay = new ReadWriterToFileXeMay();
    ReadWriterToFileXeOto readWriterToFileXeOto = new ReadWriterToFileXeOto();
    ReadWriterToFileXeTai readWriterToFileXeTai = new ReadWriterToFileXeTai();
    ReadWriterToFilephuongTien readWriterToFilephuongTien = new ReadWriterToFilephuongTien();

    public static List<XeMay> xeMayList = new ArrayList<>();
    public static List<XeOto> xeOtoList = new ArrayList<>();
    public static List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void themPhuongTien() {

    }

    @Override
    public void hienThiPhuongTien() {
        phuongTienList = readWriterToFilephuongTien.readToFilePhuongTien(phuongTienList);
        for (PhuongTien phuongTien : phuongTienList) {
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
