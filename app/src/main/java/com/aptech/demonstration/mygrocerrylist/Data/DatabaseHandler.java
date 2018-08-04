package com.aptech.demonstration.mygrocerrylist.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.aptech.demonstration.mygrocerrylist.Model.Grocery;
import com.aptech.demonstration.mygrocerrylist.Util.Constants;

import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private Context ctx;
    public DatabaseHandler(Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
        this.ctx= context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_GROCERY_TABLE = "CREATE TABLE " + Constants.TABLE_NAME + "("
                + Constants.KEY_ID + " INTEGER PRIMARY KEY, " + Constants.KY_GROCERY_ITEM + " TEXT, "
                + Constants.KEY_QTY_NUMBER + " TEXT, "
                + Constants.KEY_DATE_NAME +  " LONG);";

        db.execSQL(CREATE_GROCERY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "  + Constants.TABLE_NAME);

        onCreate(db);
    }

    /**
     * CRUD OPERATIONS: Create, Read, Update, Delete Methods
     */

    //Add Grocery
    public void AddGrocery (Grocery grocery)
    {

    }

    //Get a Grocery
    private Grocery GetGrocery(int id){
        return null;
    }

    //Get All Groceries
    public List<Grocery> getAllGroceries(){
        return null;
    }

    //Update Grocery
    public int updateGrovery(Grocery grocery){
        return 0;
    }

    //Delete Grocery
    public void deleteGrocery(int id){

    }

    //Get Count
    public int getGrocerriesCount(){
        return 0;
    }

}
