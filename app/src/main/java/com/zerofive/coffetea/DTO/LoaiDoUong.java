package com.zerofive.coffetea.DTO;

public class LoaiDoUong {
    private int id_LoaiDoUong;
    private String tenDoUong;

    public LoaiDoUong() {
    }

    public LoaiDoUong(int id_LoaiDoUong, String tenDoUong) {
        this.id_LoaiDoUong = id_LoaiDoUong;
        this.tenDoUong = tenDoUong;
    }

    public int getId_LoaiDoUong() {
        return id_LoaiDoUong;
    }

    public void setId_LoaiDoUong(int id_LoaiDoUong) {
        this.id_LoaiDoUong = id_LoaiDoUong;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public void setTenDoUong(String tenDoUong) {
        this.tenDoUong = tenDoUong;
    }
}
