package com.zerofive.coffetea.DTO;

public class KhuyenMai {
    private int id_KM;
    private String codeKM,motaKM,ngayBD,ngayKT;
    private double sotienKM;

    public KhuyenMai() {
    }

    public KhuyenMai(int id_KM, String codeKM, String motaKM, String ngayBD, String ngayKT, double sotienKM) {
        this.id_KM = id_KM;
        this.codeKM = codeKM;
        this.motaKM = motaKM;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.sotienKM = sotienKM;
    }

    public int getId_KM() {
        return id_KM;
    }

    public void setId_MKM(int id_MKM) {
        this.id_KM = id_MKM;
    }

    public String getCodeKM() {
        return codeKM;
    }

    public void setCodeKM(String codeKM) {
        this.codeKM = codeKM;
    }

    public String getMotaKM() {
        return motaKM;
    }

    public void setMotaKM(String motaKM) {
        this.motaKM = motaKM;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public double getSotienKM() {
        return sotienKM;
    }

    public void setSotienKM(double sotienKM) {
        this.sotienKM = sotienKM;
    }
}
