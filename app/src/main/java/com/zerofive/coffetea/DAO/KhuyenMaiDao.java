package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.KhuyenMai;

import java.util.ArrayList;
import java.util.List;

public class KhuyenMaiDao {
    private final SQLiteDatabase db;

    public KhuyenMaiDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<KhuyenMai> getAll(){
        List<KhuyenMai> listKM = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM KhuyenMai",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_KM = c.getInt(0);
                String codeKM = c.getString(1);
                String motaKM = c.getString(2);
                String ngayBD = c.getString(3);
                String ngayKT = c.getString(4);
                double sotienKM = c.getDouble(5);


                KhuyenMai tmpKM = new KhuyenMai(id_KM,codeKM,motaKM,ngayBD,ngayKT,sotienKM);
                listKM.add(tmpKM);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listKM;
    }
    long insertDN(KhuyenMai objKM){
        ContentValues values = new ContentValues();
        values.put("codeKM",objKM.getCodeKM());
        values.put("moTaKM",objKM.getMotaKM());
        values.put("ngayBatDau",objKM.getNgayBD());
        values.put("ngayKetThuc",objKM.getNgayKT());
        values.put("soTienKM",objKM.getSotienKM());
        return db.insert("KhuyenMai",null,values);
    }
    int delete(KhuyenMai objKM){
        String[] _id = new String[]{objKM.getId_KM()+""};
        return db.delete("DonNap","id_KM=?",_id);
    }
    int updateDN(KhuyenMai objKM){
        ContentValues values = new ContentValues();
        values.put("codeKM",objKM.getCodeKM());
        values.put("moTaKM",objKM.getMotaKM());
        values.put("ngayBatDau",objKM.getNgayBD());
        values.put("ngayKetThuc",objKM.getNgayKT());
        values.put("soTienKM",objKM.getSotienKM());
        String[] _id =new String[]{objKM.getId_KM()+""};
        return db.update("KhuyenMai",values,"id_KM=?",_id);
    }
}
