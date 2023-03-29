package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.DanhGia;

import java.util.ArrayList;
import java.util.List;

public class DanhGiaDao {
    private final SQLiteDatabase db;

    public DanhGiaDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<DanhGia> getAll(){
        List<DanhGia> listDG = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM DanhGiaDao",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_danhGia = c.getInt(0);
                int diem = c.getInt(1);
                String comment = c.getString(2);
                int id_KH = c.getInt(3);
                int id_ThucUong = c.getInt(4);
                int anhDanhGia = c.getInt(5);
                DanhGia tmpDG = new DanhGia(id_danhGia,id_KH,id_ThucUong,diem,anhDanhGia,comment);
                listDG.add(tmpDG);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listDG;
    }
    long insertHD(DanhGia objLDG){
        ContentValues values = new ContentValues();
        values.put("diem",objLDG.getDiem());
        values.put("comment",objLDG.getComment());
        values.put("id_KH",objLDG.getId_KH());
        values.put("id_ThucUong",objLDG.getId_ThucUong());
        values.put("anhDanhGia",objLDG.getAnhDanhGia());
        return db.insert("LoaiDoUong",null,values);
    }
    int delete(DanhGia objLDG){
        String[] _id = new String[]{objLDG.getId_danhGia()+""};
        return db.delete("LoaiDoUong","id_danhGia=?",_id);
    }
    int updateDH(DanhGia objLDG){
        ContentValues values = new ContentValues();
        values.put("diem",objLDG.getDiem());
        values.put("comment",objLDG.getComment());
        values.put("id_KH",objLDG.getId_KH());
        values.put("id_ThucUong",objLDG.getId_ThucUong());
        values.put("anhDanhGia",objLDG.getAnhDanhGia());
        String[] _id = new String[]{objLDG.getId_danhGia()+""};
        return db.update("LoaiDoUong",values,"id_danhGia=?",_id);
    }
}
