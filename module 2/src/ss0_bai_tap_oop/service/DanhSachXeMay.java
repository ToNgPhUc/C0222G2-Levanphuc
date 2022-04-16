package ss0_bai_tap_oop.service;


import ss0_bai_tap_oop.model.XeMay;

import java.util.ArrayList;

public class DanhSachXeMay {
    private ArrayList<XeMay> danhSach;


    public DanhSachXeMay() {
        this.danhSach = new ArrayList<XeMay>();

    }

    public DanhSachXeMay(ArrayList<XeMay> danhSach) {
        this.danhSach = danhSach;
    }

    public void themXeMay(XeMay xeMay) {
        this.danhSach.add(xeMay);
    }

    public void inDanhSachXeMay() {
        for (XeMay xeMay : danhSach) {
            System.out.println(xeMay);
        }
    }
}





