package com.mariosegovia.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}
