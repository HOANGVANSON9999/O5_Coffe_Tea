package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.DonHang;

import java.util.ArrayList;
import java.util.List;


public class DonHangDao  {
   private final SQLiteDatabase db;

    public DonHangDao(Context context) {
        DbHelper helper = new DbHelper(context);
       db = helper.getWritableDatabase();
    }

    public List<DonHang> getAll(){
        List<DonHang> listDH = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM DonHang",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_DH = c.getInt(0);
                int id_KH = c.getInt(1);
                int id_KM = c.getInt(2);
                String tgTao = c.getString(3);
                double tongTien = c.getDouble(4);
                int status = c.getInt(5);

                DonHang tmpDH = new DonHang(id_DH,id_KH,id_KM,tgTao,tongTien,status);
                listDH.add(tmpDH);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listDH;
    }
    long insertHD(DonHang objDH){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDH.getId_KH());
        values.put("id_KM",objDH.getId_KM());
        values.put("tgTao",objDH.getTgTao());
        values.put("tongTien",objDH.getTongTien());
        values.put("TrangThai",objDH.getTrangThai());
        return db.insert("DonHang",null,values);
    }
    int delete(DonHang objDH){
        String[] _id = new String[]{objDH.getId_DH()+""};
         return db.delete("DonHang","id_DH=?",_id);
    }
    int updateDH(DonHang objDH){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDH.getId_KH());
        values.put("id_KM",objDH.getId_KM());
        values.put("tgTao",objDH.getTgTao());
        values.put("tongTien",objDH.getTongTien());
        values.put("TrangThai",objDH.getTrangThai());
        String[] _id =new String[]{objDH.getId_DH()+""};
        return db.update("DonHang",values,"id_DH=?",_id);
    }
    }

