package com.example.fitnessapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {
	
	ViewPager viewPager;
	myMealPlan mymealplan;
	myProgress myprogress;
	myWorkoutPlan myworkoutplan;
	Settings settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        FragmentManager fragmentManager = getSupportFragmentManager();
		if (savedInstanceState != null) {
			mymealplan = (myMealPlan) fragmentManager.getFragment(savedInstanceState, "LEFT");
			myworkoutplan  = (myWorkoutPlan) fragmentManager.getFragment(savedInstanceState,"MIDDLE");
			myprogress = (myProgress) fragmentManager.getFragment(savedInstanceState, "LEFT");
			settings  = (Settings) fragmentManager.getFragment(savedInstanceState,"MIDDLE");

		    FragmentTransaction remove = fragmentManager.beginTransaction();
		    remove.remove(mymealplan);
		    remove.remove(myworkoutplan);
		    remove.remove(myprogress);
		    remove.remove(settings);
		    if (!remove.isEmpty()) {
		        remove.commit();
		        fragmentManager.executePendingTransactions();
		    }
		} else {
	    	mymealplan = new myMealPlan();
	    	myworkoutplan = new myWorkoutPlan();
	    	myprogress = new myProgress();
	    	settings = new Settings();
	    }

		viewPager = (ViewPager) findViewById(R.id.pager);
		if (viewPager != null) {
		  viewPager.setAdapter(new FourFragmentPagerAdapter(fragmentManager));
		} else {
		      fragmentManager.beginTransaction()
	          .add(R.id.mealFrag, mymealplan, "LEFT")
	          .add(R.id.workoutFrag, myworkoutplan, "MIDDLE")
	          .add(R.id.progressFrag, myprogress, "LEFT")
	          .add(R.id.settingsFrag, settings, "MIDDLE")
	          .commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
    public class FourFragmentPagerAdapter extends FragmentPagerAdapter {
		int PAGE_COUNT =4;
		
		public FourFragmentPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			
			switch (position) {
			  case 0: return mymealplan;
			  case 1: return myworkoutplan;
			  case 2: return myprogress;
			  case 3: return settings;
			  default: return null;
			}
		}

		@Override
		public int getCount() {

			return PAGE_COUNT;
		}
	
		//getPageTitle required for the PageStripe to work and have a value.
        @Override
        public CharSequence getPageTitle(int position) {
        	  	
        	//return String.valueOf(position);  //returns string of position for title
        	switch (position) {
			case 0:
				return "My Meal Plan";
			case 1:
				return "My Workout Plan";
			case 2:
				return "My Progress";
			case 3:
				return "Settings";
			}
			return null;
        	
        }
		
	}
}
