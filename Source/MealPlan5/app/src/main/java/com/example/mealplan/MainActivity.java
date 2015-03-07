package com.example.mealplan;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends FragmentActivity implements CreateProfile.Callbacks, OnItemClickListener {

    String username;
    String password;
    boolean isFirstTime;

    ViewPager viewPager;
    CreateProfile createFrag;

    private Cursor schedule1, schedule2;
    private MyDatabase db;
    ListView listView, listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new MyDatabase(this);
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        /*if(day == 1){
            schedule1 = db.getWorkout_day1();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_1", "wType_1", "Equiptment_1"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else if (day == 2)
        {
            schedule1 = db.getWorkout_day2();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_2", "wType_2", "Equiptment_2"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else if (day == 3){
            schedule1 = db.getWorkout_day3();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_3", "wType_3", "Equiptment_3"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else if (day == 4){
            schedule1 = db.getWorkout_day4();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_4", "wType_4", "Equiptment_4"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else if (day == 5){
            schedule1 = db.getWorkout_day5();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_5", "wType_5", "Equiptment_5"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else if (day == 6){
            schedule1 = db.getWorkout_day6();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_6", "wType_6", "Equiptment_6"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
        else{
            schedule1 = db.getWorkout_day7();
            ListView listView1 = (ListView) findViewById(R.id.list);
            listView1.setOnItemClickListener(this);
            listView1.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row2,
                    schedule1,
                    new String[]{"wName_7", "wType_7", "Equiptment_7"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView1);
            schedule2 = db.getSchedule();
            ListView listView2 = (ListView) findViewById(R.id.list2);
            listView2.setAdapter(new SimpleCursorAdapter(
                    MainActivity.this,
                    R.layout.row,
                    schedule2,
                    new String[]{"fName", "Calories", "Protein", "Carbs"},
                    new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4},
                    0));
            Utility.setListViewHeightBasedOnChildren(listView2);
        }
*/
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.container, new CreateProfile()).commit();
//        createFrag = new CreateProfile();
//        viewPager = (ViewPager) findViewById(R.id.pager);
//        viewPager.setAdapter(new FragPagerAdapter(fragmentManager));
//        Intent intent = new Intent(this, CreateProfile.class);
//        startActivity(intent);

        //if(isFirstTime)
        //{

        //}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        //savedInstanceState.putString(username, username);
        super.onSaveInstanceState(savedInstanceState);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.putFragment(savedInstanceState, "MIDDLE", createFrag);
    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, Description.class);
        intent.putExtra("Carbs", ((TextView) v.findViewById(R.id.textView4)).getText()) ;
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        schedule1.close();
        schedule2.close();
        db.close();
    }

    public class FragPagerAdapter extends FragmentPagerAdapter {
        int pagecount = 1;

        public FragPagerAdapter(FragmentManager fm) {super(fm);}

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0: return createFrag;
                default: return null;
            }
        }

        @Override
        public int getCount() {

            return pagecount;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            //return String.valueOf(position);  //returns string of position for title
            switch (position) {
                case 0:
                    return "Create Profile";
            }
            return null;

        }

    }

    @Override
    public void ValidProfile()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new WorkoutPlan()).commit();
    }
}
