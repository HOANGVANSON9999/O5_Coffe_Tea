package com.zerofive.coffetea.DTO;

public class DonHang {
    private int id_DH,id_KH,id_KM,trangThai;
    private String tgTao;
    private double tongTien;

    public DonHang() {
    }

    public DonHang(int id_DH, int id_KH, int id_KM, String tgTao, double tongTien, int trangThai) {
        this.id_DH = id_DH;
        this.id_KH = id_KH;
        this.id_KM = id_KM;
        this.tgTao = tgTao;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public int getId_DH() {
        return id_DH;
    }

    public void setId_DH(int id_DH) {
        this.id_DH = id_DH;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public int getId_KM() {
        return id_KM;
    }

    public void setId_KM(int id_KM) {
        this.id_KM = id_KM;
    }

    public String getTgTao() {
        return tgTao;
    }

    public void setTgTao(String tgTao) {
        this.tgTao = tgTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
