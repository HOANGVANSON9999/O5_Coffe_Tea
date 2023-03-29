package com.zerofive.coffetea.DTO;

public class DonNap {
    private int id_DonNap,id_KH,trangThai,anhHoaDon;
    private String ngayTao;
    private double tienNap;

    public DonNap() {
    }

    public DonNap(int id_DonNap, int id_KH, String ngayTao, double tienNap, int trangThai) {
        this.id_DonNap = id_DonNap;
        this.id_KH = id_KH;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.tienNap = tienNap;
    }

    public int getId_DonNap() {
        return id_DonNap;
    }

    public void setId_DonNap(int id_DonNap) {
        this.id_DonNap = id_DonNap;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getAnhHoaDon() {
        return anhHoaDon;
    }

    public void setAnhHoaDon(int anhHoaDon) {
        this.anhHoaDon = anhHoaDon;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTienNap() {
        return tienNap;
    }

    public void setTienNap(double tienNap) {
        this.tienNap = tienNap;
    }
}
