package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.CTDonHang;

import java.util.ArrayList;
import java.util.List;

public class CTDonHangDao {
    private final SQLiteDatabase db;

    public CTDonHangDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<CTDonHang> getAll(){
        List<CTDonHang> listCTDH = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM CTDonHang",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_ct = c.getInt(0);
                int id_DH = c.getInt(1);
                int id_ThucUong = c.getInt(2);
                int soluong = c.getInt(3);
                double giaTien = c.getDouble(4);


                CTDonHang tmpCTDH = new CTDonHang(id_ct,id_DH,id_ThucUong,soluong,giaTien);
                listCTDH.add(tmpCTDH);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listCTDH;
    }
    long insertHD(CTDonHang objCTDH){
        ContentValues values = new ContentValues();
        values.put("id_DH",objCTDH.getId_DH());
        values.put("id_ThucUong",objCTDH.getId_ThucUong());
        values.put("soluong",objCTDH.getSoluong());
        values.put("giaTien",objCTDH.getGiaTien());


        return db.insert("CTDonHang",null,values);
    }
    int delete(CTDonHang objCTDH){
        String[] _id = new String[]{objCTDH.getId_ThucUong()+""};
        return db.delete("CTDonHang","id_ct=?",_id);
    }
    int updateDH(CTDonHang objCTDH){
        ContentValues values = new ContentValues();
        values.put("id_ct",objCTDH.getId_ct());
        values.put("id_DH",objCTDH.getId_DH());
        values.put("id_ThucUong",objCTDH.getId_ThucUong());
        values.put("soluong",objCTDH.getSoluong());
        values.put("giaTien",objCTDH.getGiaTien());
        String[] _id =new String[]{objCTDH.getId_ct()+""};
        return db.update("CTDonHang",values,"id_ct=?",_id);
    }
}
