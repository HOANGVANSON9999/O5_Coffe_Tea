package com.zerofive.coffetea.DTO;

public class ThucUong {
   private int id_ThucUong,id_LoaiDoUong,anhMon,trangThai;
    private String tenDoUong,moTa,topping;
    private double gia;

    public ThucUong() {
    }

    public ThucUong(int id_ThucUong, int id_LoaiDoUong, int anhMon, String tenDoUong, String moTa,String topping, int trangThai, double gia) {
        this.id_ThucUong = id_ThucUong;
        this.id_LoaiDoUong = id_LoaiDoUong;
        this.anhMon = anhMon;
        this.tenDoUong = tenDoUong;
        this.moTa = moTa;
        this.topping = topping;
        this.trangThai = trangThai;
        this.gia = gia;
    }

    public int getId_ThucUong() {
        return id_ThucUong;
    }

    public void setId_ThucUong(int id_ThucUong) {
        this.id_ThucUong = id_ThucUong;
    }

    public int getId_LoaiDoUong() {
        return id_LoaiDoUong;
    }

    public void setId_LoaiDoUong(int id_LoaiDoUong) {
        this.id_LoaiDoUong = id_LoaiDoUong;
    }

    public int getAnhMon() {
        return anhMon;
    }

    public void setAnhMon(int anhMon) {
        this.anhMon = anhMon;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public void setTenDoUong(String tenDoUong) {
        this.tenDoUong = tenDoUong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }


    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
