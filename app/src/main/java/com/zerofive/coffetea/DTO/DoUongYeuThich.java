package com.zerofive.coffetea.DTO;

public class DoUongYeuThich {
    private int id_ThucUong,id_KH;

    public DoUongYeuThich() {
    }

    public DoUongYeuThich(int id_ThucUong, int id_KH) {
        this.id_ThucUong = id_ThucUong;
        this.id_KH = id_KH;
    }

    public int getId_ThucUong() {
        return id_ThucUong;
    }

    public void setId_ThucUong(int id_ThucUong) {
        this.id_ThucUong = id_ThucUong;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }
}
