package com.lin.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void bmi(View view){
        Log.d("MainActivit","testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        new AlertDialog.Builder(this)
                .setTitle("mytitle")
                .setMessage("Your bmi:"+bmi)
                .setPositiveButton("OK",null)
                .setNegativeButton("CANCEL",null)
               // .setNeutralButton("hi",null)
                .show();
        Log.d("MainActivity","bmi:"+bmi);
        Toast.makeText(this,"Your bmi:"+bmi,Toast.LENGTH_LONG).show();
    }
}
