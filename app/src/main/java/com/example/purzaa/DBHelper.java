package com.example.purzaa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;

public class DBHelper {
    private Context con;
    private SQLiteDatabase db;
    public DBHelper(Context con){
        this.con =con;
    }
    public DBHelper OpenDB(){
        DBConnector dbCon = new DBConnector(con);
        db = dbCon.getWritableDatabase();
        return this;
    }
    public boolean SignUpCustomer(Customer customer){
        try{
            ContentValues cv = new ContentValues();
            cv.put("Fullname", customer.getFullname());
            cv.put("UserName",customer.getUserName());
            cv.put("Email",customer.getEmail());
            cv.put("Password",customer.getPassword());

            db.insert("customerInfo",null,cv);
            return true;
        }
        catch (Exception e){
            Toast.makeText(con, e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public ArrayList<Customer> LoginCustomer(String UserName, String Password){
        ArrayList<Customer> useList = new ArrayList<Customer>();
        try{
            Cursor cursor = db.rawQuery("Select * from customerInfo where UserName= '"+UserName+"' and Password= '"+Password+"' ", null);
            if(cursor.moveToFirst()){
                do{
                    Customer customer = new Customer();
                    customer.setUserName(cursor.getString(0));
                    customer.setPassword(cursor.getString(1));
                    useList.add(customer);
                }
                while(cursor.moveToNext());
            }
        }
        catch (Exception e){
            Toast.makeText(con,e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return useList;
    }
}


