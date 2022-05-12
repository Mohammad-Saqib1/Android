package com.myapplication.FoodDeleveryApp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.myapplication.FoodDeleveryApp.Models.OrderModel;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    final static String DBNAME="mydatabase.db";
    final static int DBVERSION=5;
    public DBHelper(@Nullable Context context)
    {
        super(context, DBNAME, null, DBVERSION);
    }

    //Insert Data
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table orders "+
                        "(id integer primary key autoincrement,"+
                        "name text,"+
                        "phone text,"+
                        "price int,"+
                        "image int,"+
                        "description text,"+
                        "foodname text," +
                        "quantity int)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP table if exists orders");
        onCreate(sqLiteDatabase);
    }

    public boolean insertOrder( String name, String phone,int price, int image, String desc, String foodName, int quantity){
        SQLiteDatabase database=getReadableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("price",price);
        values.put("image",image);
        values.put("description",desc);
        values.put("foodName",foodName);
        values.put("quantity",quantity);
        values.put("phone",phone);

       long id= database.insert("orders",null,values);
        if(id<=0){
            return false;
        }else{
            return true;
        }

    }

    //Read Data
    public ArrayList<OrderModel> getOrders(){
        ArrayList<OrderModel> orders=new ArrayList<>();
        SQLiteDatabase database=this.getWritableDatabase();
        Cursor cursor=database.rawQuery("Select id,foodname,image,price from orders",null);
        if(cursor.moveToFirst()){
            while(cursor.moveToNext()){
                OrderModel model=new OrderModel();
                model.setOrderNumber(cursor.getInt(0)+" ");
                model.setSoldItems(cursor.getString(1));
               model.setOrderImage(cursor.getInt(2));
               model.setPrice(cursor.getInt(3)+" ");
               orders.add(model);
            }
        }
        cursor.close();
        database.close();
        return orders;
    }


    public int deletedOrder(String id){
        SQLiteDatabase database=this.getWritableDatabase();
        return database.delete("orders","id="+id,null);
    }
}
