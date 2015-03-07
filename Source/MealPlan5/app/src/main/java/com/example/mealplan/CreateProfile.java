package com.example.mealplan;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CreateProfile.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CreateProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateProfile extends Fragment {


    private OnFragmentInteractionListener mListener;
    private Callbacks mCallbacks = sDummyCallbacks;
    Context myContext;

    EditText textusername;
    EditText textage;
    EditText textweight;
    EditText textgoal;
    EditText textbudget;
    EditText textcalorieintake;
    EditText textallergies;

    Button next;

    Spinner spinner;
    //Spinner allergySpinner;

    String user;
    int age;
    int weight;
    int workoutperweek;
    int goalweight;
    int budget;
    int calorieintake;
    String allergies;




    public static CreateProfile newInstance() {
        CreateProfile fragment = new CreateProfile();
        Bundle args = new Bundle();
        return fragment;
    }

    public CreateProfile() {
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
        final View view = inflater.inflate(R.layout.create_profile, container, false);



        addSpinnerListener(view);
        Button next = (Button) view.findViewById(R.id.next1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createProfile(view);
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
        myContext = activity.getApplicationContext();
        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = sDummyCallbacks;
        mListener = null;
    }

    private static Callbacks sDummyCallbacks = new Callbacks() {

        public void ValidProfile() {
            //Log.v("callback", "onitemselected dummny");
        }
        //@Override
        //public void invalidateView() {
        //}
    };

    public interface Callbacks {
        public void ValidProfile();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

    public void createProfile(View v)
    {

        boolean validpro = true;

        textusername = (EditText) v.findViewById(R.id.username);
        textage = (EditText) v.findViewById(R.id.age);
        textweight = (EditText) v.findViewById(R.id.weight);
        textgoal = (EditText) v.findViewById(R.id.goalweight);
        textbudget = (EditText) v.findViewById(R.id.budget);
        textcalorieintake = (EditText) v.findViewById(R.id.calorieintake);
        textallergies = (EditText) v.findViewById(R.id.allergies);

        String temp = textusername.getText().toString();

        if(temp.length() > 25)
        {
            Toast.makeText(myContext, "Username must be less than 26 characters", Toast.LENGTH_LONG);
            validpro = false;
        }
        else
            user = temp;

        age = Integer.parseInt(textage.getText().toString());
        weight = Integer.parseInt(textweight.getText().toString());
        goalweight = Integer.parseInt(textgoal.getText().toString());
        workoutperweek = Integer.parseInt(String.valueOf(spinner.getSelectedItem()));
        budget = Integer.parseInt(textbudget.getText().toString());
        calorieintake = Integer.parseInt(textcalorieintake.getText().toString());
        allergies = textallergies.getText().toString();

//        catch(Exception e) {
//            Toast.makeText(myContext, "A value must be chosen for workouts per week", Toast.LENGTH_LONG);
//            validpro = false;
//        }
        if(validpro) {
            mCallbacks.ValidProfile();
        }
        else
        {
            Toast.makeText(myContext, "A value must be entered for every category", Toast.LENGTH_LONG);
        }
    }

    public void addSpinnerListener(View v)
    {
        spinner = (Spinner) v.findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }


}


