package com.zerofive.coffetea.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    static final String DB_NAME = "CRUD_DuAn1";
    static final int DB_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_ThucUong="create table ThucUong("+"id_ThucUong integer primary key Autoincrement,"+"tenThucUong text not null,anhMon blob not null,"+"gia number not null,"+"moTa text not null,"+"topping text not null,"+"trangThai text not null,"+"id_LoaiDoUong integer references LoaiDoUong(id_LoaiDoUong))";
        db.execSQL(sql_ThucUong);
        String sql_LoaiDoUong="create table LoaiDoUong("+"id_LoaiDoUong integer primary key autoincrement,"+"tenDoUong text not null)";
        db.execSQL(sql_LoaiDoUong);
        String sql_KhachHang="create table KhachHang("+"id_KH integer primary key autoincrement,"+"tenKH text not null,"+"ngaySinh date not null,"+"sdt text not null,"+"tenTK text not null,matKhau text not null,"+"diaChi text not null,"+"sdtk number not null)";
        db.execSQL(sql_KhachHang);
        String sql_DonHang = "create table DonHang("+"id_DH integer primary key autoincrement,"+"thoiGianTao date not null,"+"trangThai int not null,"+"tongTien number not null,"+"id_KH integer references KhachHang(id_KH),"+"id_KM integer references KhuyenMai(id_KM))";
        db.execSQL(sql_DonHang);
        String sql_CTDonHang = "create table CTDonHang("+"id_ct integer primary key autoincrement,"+"soluong int not null,"+"giaTien number not null,"+"id_DH integer references DonHang(id_DH),"+"id_ThucUong integer references ThucUong(id_ThucUong))";
        db.execSQL(sql_CTDonHang);
        String sql_DonNap = "create table DonNap("+"id_DN integer primary key autoincrement,"+"id_KH integer references KhachHang(id_KH),"+" thoiGianTao date not null,"+"trangThai int not null,"+"tienNap number not null)";
        db.execSQL(sql_DonNap);
        String sql_DoUongYeuThich = "create table DoUongYeuThich("+"id_ThucUong integer references id_ThucUong(id_ThucUong),"+"id_KH integer references KhachHang(id_KH))";
        db.execSQL(sql_DoUongYeuThich);
        String sql_DanhGia = "create table DanhGia("+"id_danhGia integer primary key autoincrement,"+"diem int not null,"+"comment text ,"+"anhDanhGia blob ,"+"id_KH integer references DonHang(id_KH),"+"id_ThucUong integer references ThucUong(id_ThucUong))";
        db.execSQL(sql_DanhGia);
        String sql_KhuyenMai = "create table KhuyenMai("+"id_KM integer primary key autoincrement,"+"codeKM text not null,"+"moTaKM text not null,"+"ngayBatDau date not null,"+"ngayKetThuc date not null,"+"soTienKM number not null)";
        db.execSQL(sql_KhuyenMai);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
