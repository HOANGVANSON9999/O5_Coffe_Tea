package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.LoaiDoUong;

import java.util.ArrayList;
import java.util.List;

public class LoaiDoUongDao {
    private final SQLiteDatabase db;

    public LoaiDoUongDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<LoaiDoUong> getAll(){
        List<LoaiDoUong> listLDU = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM LoaiDoUong",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_LoaiDoUong = c.getInt(0);

                String tenDoUong = c.getString(3);


                LoaiDoUong tmpLDU = new LoaiDoUong(id_LoaiDoUong,tenDoUong);
                listLDU.add(tmpLDU);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listLDU;
    }
    long insertHD(LoaiDoUong objLDU){
        ContentValues values = new ContentValues();
        values.put("tenDoUong",objLDU.getTenDoUong());

        return db.insert("LoaiDoUong",null,values);
    }
    int delete(LoaiDoUong objLDU){
        String[] _id = new String[]{objLDU.getId_LoaiDoUong()+""};
        return db.delete("LoaiDoUong","id_DH=?",_id);
    }
    int updateDH(LoaiDoUong objLDU){
        ContentValues values = new ContentValues();
        values.put("tenDoUong",objLDU.getTenDoUong());
        String[] _id =new String[]{objLDU.getId_LoaiDoUong()+""};
        return db.update("LoaiDoUong",values,"id_LoaiDoUong=?",_id);
    }
}
