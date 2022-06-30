package com.phuc.dem_so_luot_view_trang.model;

public class Counter {
    private int count;
    private int nhan;

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getNhan() {
        return nhan;
    }

    public void setNhan(int nhan) {
        this.nhan = nhan;
    }

    public int increment() {
        return count++;
    }


    public int nhan(){
        return nhan+2;
    }
}
