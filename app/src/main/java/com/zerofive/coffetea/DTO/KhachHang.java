package com.zerofive.coffetea.DTO;

public class KhachHang {
    private int id_KH,sdt;
    private double sdtk;//số dư tk
    private String tenKH,tenTK,matKhau,ngaySinh,diaChi;

    public KhachHang() {
    }

    public KhachHang(int id_KH, int sdt, String tenKH, double sdtk, String ngaySinh, String tenTK, String matKhau, String diaChi) {
        this.id_KH = id_KH;
        this.sdt = sdt;
        this.sdtk = sdtk;
        this.tenKH = tenKH;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public double getSdtk() {
        return sdtk;
    }

    public void setSdtk(double sdtk) {
        this.sdtk = sdtk;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
