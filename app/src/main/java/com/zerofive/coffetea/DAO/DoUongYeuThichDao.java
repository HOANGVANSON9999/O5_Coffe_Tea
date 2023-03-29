package com.zerofive.coffetea.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.zerofive.coffetea.DBHelper.DbHelper;
import com.zerofive.coffetea.DTO.DoUongYeuThich;

import java.util.ArrayList;
import java.util.List;

public class DoUongYeuThichDao {
    private final SQLiteDatabase db;

    public DoUongYeuThichDao(Context context) {
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public List<DoUongYeuThich> getAll(){
        List<DoUongYeuThich> listDUYT = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * FROM DoUongYeuThich",null);
        if(c.moveToFirst()){
            while(!c.isAfterLast()){
                int id_ThucUong = c.getInt(0);
                int id_KH = c.getInt(1);


                DoUongYeuThich tmpDUYT = new DoUongYeuThich(id_ThucUong,id_KH);
                listDUYT.add(tmpDUYT);
                c.moveToNext();
            }
        }else{
            Log.d("zzz", "selectAll: Không có dữ liệu");
        }
        return listDUYT;
    }
    long insertHD(DoUongYeuThich objDUYT){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDUYT.getId_KH());

        return db.insert("DoUongYeuThich",null,values);
    }
    int delete(DoUongYeuThich objLDU){
        String[] _id = new String[]{objLDU.getId_ThucUong()+""};
        return db.delete("DoUongYeuThich","id_ThucUong=?",_id);
    }
    int updateDH(DoUongYeuThich objDUYT){
        ContentValues values = new ContentValues();
        values.put("id_KH",objDUYT.getId_KH());
        String[] _id =new String[]{objDUYT.getId_ThucUong()+""};
        return db.update("DoUongYeuThich",values,"id_ThucUong=?",_id);
    }
}
