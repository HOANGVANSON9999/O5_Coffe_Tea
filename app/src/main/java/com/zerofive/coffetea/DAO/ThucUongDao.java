package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.ThucUong;

import java.util.ArrayList;
import java.util.List;

public class ThucUongDao {
    private final SQLiteDatabase db;

    public ThucUongDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<ThucUong> getAll(){
        List<ThucUong> listTU = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM ThucUong",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_ThucUong = c.getInt(0);
                int id_LoaiDoUong = c.getInt(1);
                int anhMon = c.getInt(2);
                String tenDoUong = c.getString(3);
                String moTa= c.getString(4);
                String topping = c.getString(5);
                int trangThai = c.getInt(6);
                double gia = c.getDouble(7);

                ThucUong tmpTU = new ThucUong(id_ThucUong,id_LoaiDoUong,anhMon,tenDoUong,moTa,topping,trangThai,gia);
                listTU.add(tmpTU);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listTU;
    }
    long insertTU(ThucUong objTU){
        ContentValues values = new ContentValues();
        values.put("id_LoaiDoUong",objTU.getId_LoaiDoUong());
        values.put("anhMon",objTU.getAnhMon());
        values.put("tenDoUong",objTU.getTenDoUong());
        values.put("moTa",objTU.getMoTa());
        values.put("tooping",objTU.getTopping());
        values.put("trangThai",objTU.getTrangThai());
        values.put("gia",objTU.getGia());
        return db.insert("ThucUong",null,values);
    }
    int delete(ThucUong objTU){
        String[] _id = new String[]{objTU.getId_ThucUong()+""};
        return db.delete("ThucUong","id_ThucUong=?",_id);
    }
    int updateKH(ThucUong objTU){
        ContentValues values = new ContentValues();
        values.put("id_LoaiDoUong",objTU.getId_LoaiDoUong());
        values.put("anhMon",objTU.getAnhMon());
        values.put("tenDoUong",objTU.getTenDoUong());
        values.put("moTa",objTU.getMoTa());
        values.put("tooping",objTU.getTopping());
        values.put("trangThai",objTU.getTrangThai());
        values.put("gia",objTU.getGia());
        String[] _id = new String[]{objTU.getId_ThucUong()+""};
        return db.update("DonNap",values,"id_ThucUong=?",_id);
    }
}
