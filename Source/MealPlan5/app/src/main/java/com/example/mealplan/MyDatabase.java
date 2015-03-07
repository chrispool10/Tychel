package com.example.mealplan;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class MyDatabase extends SQLiteAssetHelper  {

	private static final String DATABASE_NAME = "Schedule1";
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

    public Cursor getMeal_day1() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, "RANDOM() limit 6");

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day2() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day3() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day4() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day5() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day6() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getMeal_day7() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName", "wType", "Equipment"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "allWorkouts";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getAllWorkout() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"wName", "wType", "Equipment", "Description"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "Allworkout";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day1() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_1", "wType_1", "Equiptment_1"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_1";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, "RANDOM() limit 6");

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day2() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"wName_2", "wType_2", "Equiptment_2"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_2";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day3() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_3", "wType_3", "Equiptment_3"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_3";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day4() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_4", "wType_4", "Equiptment_4"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_4";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day5() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_5", "wType_5", "Equiptment_5"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_5";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day6() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_6", "wType_6", "Equiptment_6"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_6";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor getWorkout_day7() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlProject = {"0 _id", "wName_7", "wType_7", "Equiptment_7"};
        String sqlSelect = "`wType` = ?";
        String [] sqlSelectArg = {"Bicep"};
        String sqlTables = "WorkoutDay_7";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlProject, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }
}
