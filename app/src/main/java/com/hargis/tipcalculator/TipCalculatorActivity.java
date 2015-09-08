package com.hargis.tipcalculator;

import android.app.Activity;
import android.os.Bundle;

import static com.hargis.tipcalculator.R.layout.activity_main;
import static com.hargis.tipcalculator.R.layout.activity_main_twopane_land;
import static com.hargis.tipcalculator.R.layout.activity_settings;
import static com.hargis.tipcalculator.R.layout.fragment_tip_calculator;

public class TipCalculatorActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     
        
        // set the view for the activity using XML
        setContentView(activity_main);
    }
}