package com.example.mealplan;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends ListActivity implements OnClickListener {

    private Cursor schedule;
    private MyDatabase db;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button) findViewById(android.R.id.button1);
        db = new MyDatabase(this);
        
        b1.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		schedule = db.getSchedule();
        		ListView listView = (ListView) findViewById(android.R.id.list);
        		listView.setAdapter(new SimpleCursorAdapter(
        				MainActivity.this, 
        				R.layout.row,  
        				schedule,                   
        				new String[] {"fName", "Calories", "Protein", "Carbs" },  
        				new int[] { R.id.textView1,  R.id.textView2,  R.id.textView3,  R.id.textView4 },   
        				0));
        	}
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        schedule.close();
        db.close();
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}   
}

