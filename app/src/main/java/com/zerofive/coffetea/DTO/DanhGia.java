package com.zerofive.coffetea.DTO;

public class DanhGia {
    private int id_danhGia,id_KH,id_ThucUong,diem,anhDanhGia;
    private String comment;

    public DanhGia() {
    }

    public DanhGia(int id_danhGia, int id_KH, int id_ThucUong, int diem, int anhDanhGia, String comment) {
        this.id_danhGia = id_danhGia;
        this.id_KH = id_KH;
        this.id_ThucUong = id_ThucUong;
        this.diem = diem;
        this.anhDanhGia = anhDanhGia;
        this.comment = comment;
    }

    public int getId_danhGia() {
        return id_danhGia;
    }

    public void setId_danhGia(int id_danhGia) {
        this.id_danhGia = id_danhGia;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public int getId_ThucUong() {
        return id_ThucUong;
    }

    public void setId_ThucUong(int id_ThucUong) {
        this.id_ThucUong = id_ThucUong;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getAnhDanhGia() {
        return anhDanhGia;
    }

    public void setAnhDanhGia(int anhDanhGia) {
        this.anhDanhGia = anhDanhGia;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
