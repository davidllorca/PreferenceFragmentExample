package com.davidllorca.preferencefragmentexample;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class PreferenceFragmentExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PreferenceFragment preferenceFragment = new PreferenceFragment();
        fragmentTransaction.replace(android.R.id.content, preferenceFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
}
