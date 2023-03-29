package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangDao {
    private final SQLiteDatabase db;

    public KhachHangDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<KhachHang> getAll(){
        List<KhachHang> listKH = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM KhachHang",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_KH = c.getInt(0);
                int sdt = c.getInt(1);
                String tenKH = c.getString(2);
                double sdtk = c.getDouble(3);
                String ngaySinh= c.getString(4);
                String tenTK = c.getString(5);
                String matKhau = c.getString(6);
                String diaChi = c.getString(7);

                KhachHang tmpKH = new KhachHang(id_KH,sdt,tenKH,sdtk,ngaySinh,tenTK,matKhau,diaChi);
                listKH.add(tmpKH);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listKH;
    }
    long insertKH(KhachHang objKH){
        ContentValues values = new ContentValues();
        values.put("sdt",objKH.getSdt());
        values.put("tenKH",objKH.getTenKH());
        values.put("sdtk",objKH.getSdtk());
        values.put("ngaySinh",objKH.getNgaySinh());
        values.put("tenTK",objKH.getTenTK());
        values.put("matKhau",objKH.getMatKhau());
        values.put("diaChi",objKH.getDiaChi());
        return db.insert("KhachHang",null,values);
    }
    int delete(KhachHang objKH){
        String[] _id = new String[]{objKH.getId_KH()+""};
        return db.delete("KhachHang","id_KH=?",_id);
    }
    int updateKH(KhachHang objKH){
        ContentValues values = new ContentValues();
        values.put("sdt",objKH.getSdt());
        values.put("tenKH",objKH.getTenKH());
        values.put("sdtk",objKH.getSdtk());
        values.put("ngaySinh",objKH.getNgaySinh());
        values.put("tenTK",objKH.getTenTK());
        values.put("matKhau",objKH.getMatKhau());
        values.put("diaChi",objKH.getDiaChi());
        String[] _id = new String[]{objKH.getId_KH()+""};
        return db.update("DonNap",values,"id_KH=?",_id);
    }
}
