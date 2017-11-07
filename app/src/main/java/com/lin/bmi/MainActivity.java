package com.lin.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getResources().getString(R.string.app_name);
        Button bhelp = (Button) findViewById(R.id.b_help);
        bhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.bmi_help)
                        .setMessage(R.string.bmi_method)
                        .setPositiveButton(R.string.ok,null)
                        .setNegativeButton(R.string.cancel,null)
                        // .setNeutralButton("hi",null)
                        .show();
            }
        });
    }
     public void bmi(View view){
        //Log.d("MainActivit","testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        new AlertDialog.Builder(this)
                .setTitle(R.string.bmi_titile)
                .setMessage(getString(R.string.your_bmi)+bmi)
                .setPositiveButton(R.string.ok,null)
                .setNegativeButton(R.string.cancel,null)
               // .setNeutralButton("hi",null)
                .show();
       /* Log.d("MainActivity","bmi:"+bmi);*/
        Toast.makeText(this,getString(R.string.your_bmi)+bmi+":"+bmi, Toast.LENGTH_LONG).show();
    }
}
