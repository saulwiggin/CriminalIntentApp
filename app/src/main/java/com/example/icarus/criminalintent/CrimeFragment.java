package com.example.icarus.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Icarus on 9/9/2014.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle savedInstanceState);
        mCrime = new Crime();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
            Bundle savedInstanceState){
            view v = inflater.inflate(R.layout.fragment_crime, parent, false);
            return v;
        }
    
}
