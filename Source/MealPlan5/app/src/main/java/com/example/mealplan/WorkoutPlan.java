package com.example.mealplan;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cpool on 3/1/2015.
 */
public class WorkoutPlan extends Fragment {
    String user;
    int age;
    int weight;
    int workoutperweek;
    int goalweight;
    int budget;
    int calorieintake;

    public static WorkoutPlan newInstance() {
        WorkoutPlan fragment = new WorkoutPlan();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public WorkoutPlan() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.workout_plan, container, false);

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//        myContext = activity.getApplicationContext();
//        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
//        mCallbacks = sDummyCallbacks;
//        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
