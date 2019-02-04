package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pocetsirek;
    TextView showValue;
    Integer editText = 16;
    Integer vyhra = 0;
    int duration = Toast.LENGTH_LONG;
    CharSequence text = "Vyhrál jsi ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showValue = (TextView) findViewById(R.id.editText);

    }

    public void vyhrani(View view) {
        if (editText == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();
        }
    }

    public void odecist1(View view) {
        editText--;
        editText--;
        showValue.setText(Integer.toString(editText));

    }

    public void odecist2(View view) {
        editText--;
        editText--;
        editText--;
        editText--;
        editText--;
        showValue.setText(Integer.toString(editText));
    }

    public void reset50(View view) {
        editText = 16;
        showValue.setText(String.valueOf(editText));
    }

}


