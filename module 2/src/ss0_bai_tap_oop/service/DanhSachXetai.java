package ss0_bai_tap_oop.service;

import ss0_bai_tap_oop.model.XeTai;

import java.util.ArrayList;

public class DanhSachXetai {
    private ArrayList<XeTai> danhSachXeTai;


    public DanhSachXetai(){
        danhSachXeTai= new ArrayList<XeTai>();
    }


    public DanhSachXetai(ArrayList<XeTai> danhSachXeTai) {
        this.danhSachXeTai = danhSachXeTai;
    }

    public void themXeTai(XeTai xeTai){
       this.danhSachXeTai.add(xeTai);
    }

}
