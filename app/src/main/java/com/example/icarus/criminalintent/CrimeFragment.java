package com.example.icarus.criminalintent;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Icarus on 9/9/2014.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle savedInstanceState);
        mCrime = new Crime();
    }
}
