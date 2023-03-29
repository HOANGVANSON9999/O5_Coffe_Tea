package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.DonNap;

import java.util.ArrayList;
import java.util.List;

public class DonNapDao {
    private final SQLiteDatabase db;

    public DonNapDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<DonNap> getAll(){
        List<DonNap> listDN = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM DonNap",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_DonNap = c.getInt(0);
                int id_KH = c.getInt(1);
                String ngayTao = c.getString(2);
                double tienNap = c.getDouble(3);
                int trangThai = c.getInt(4);

                DonNap tmpDN = new DonNap(id_DonNap,id_KH,ngayTao,tienNap,trangThai);
                listDN.add(tmpDN);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listDN;
    }
    long insertDN(DonNap objDN){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDN.getId_KH());
        values.put("ngayTao",objDN.getNgayTao());
        values.put("tienNap",objDN.getTienNap());
        values.put("TrangThai",objDN.getTrangThai());
        return db.insert("DonNap",null,values);
    }
    int delete(DonNap objDN){
        String[] _id = new String[]{objDN.getId_DonNap()+""};
        return db.delete("DonNap","id_DN=?",_id);
    }
    int updateDN(DonNap objDN){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDN.getId_KH());
        values.put("ngayTao",objDN.getNgayTao());
        values.put("tienNap",objDN.getTienNap());
        values.put("TrangThai",objDN.getTrangThai());
        String[] _id =new String[]{objDN.getId_DonNap()+""};
        return db.update("DonNap",values,"id_DN=?",_id);
    }
}
