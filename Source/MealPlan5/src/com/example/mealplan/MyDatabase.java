package com.example.mealplan;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class MyDatabase extends SQLiteAssetHelper  {

	private static final String DATABASE_NAME = "Schedule";
	private static final int DATABASE_VERSION = 1;
	
	public MyDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);

	}

	public Cursor getSchedule() {

		SQLiteDatabase db = getReadableDatabase();
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

		String [] sqlProject = {"0 _id", "fName", "Calories", "Protein", "Carbs", "fType"}; 
		String sqlSelect = "`fType` = ?";
		String [] sqlSelectArg = {"Meat"};
		String sqlTables = "Schedule";

		qb.setTables(sqlTables);
		Cursor c = qb.query(db, sqlProject, null, null,
				null, null, "RANDOM() limit 6");

		c.moveToFirst();
		return c;

	}

}
