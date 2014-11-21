package com.example.fitnessapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class myProgress extends Fragment{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		View view = inflater.inflate(R.layout.myprogress, container, false);

		return view;
	}
	
	@Override
	public void onResume() {
      super.onResume(); 

    }
    @Override
	public void onPause() {
      super.onPause();

    }
    
    @Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

	}

}
