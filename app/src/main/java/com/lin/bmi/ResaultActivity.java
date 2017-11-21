package com.lin.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resault);
       Float bmi = getIntent().getFloatExtra(getString(R.string.exbmi),0);
        TextView resault = (TextView) findViewById(R.id.text_resault);
        resault.setText(getString(R.string.exbmi)+bmi);
    }
}
