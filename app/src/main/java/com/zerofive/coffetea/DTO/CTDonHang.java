package com.zerofive.coffetea.DTO;

public class CTDonHang {
    private int id_ct,id_DH,id_ThucUong,soluong;
    private double giaTien;

    public CTDonHang() {
    }

    public CTDonHang(int id_ct, int id_DH, int id_ThucUong, int soluong, double giaTien) {
        this.id_ct = id_ct;
        this.id_DH = id_DH;
        this.id_ThucUong = id_ThucUong;
        this.soluong = soluong;
        this.giaTien = giaTien;
    }

    public int getId_ct() {
        return id_ct;
    }

    public void setId_ct(int id_ct) {
        this.id_ct = id_ct;
    }

    public int getId_DH() {
        return id_DH;
    }

    public void setId_DH(int id_DH) {
        this.id_DH = id_DH;
    }

    public int getId_ThucUong() {
        return id_ThucUong;
    }

    public void setId_ThucUong(int id_ThucUong) {
        this.id_ThucUong = id_ThucUong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
}
