package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pocetsirek;
    TextView showValue;
    int editText = 16;
    Context context = getApplicationContext();
    int duration = Toast.LENGTH_LONG;
    CharSequence text = "Vyhrál jsi ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showValue = (TextView) findViewById(R.id.editText);

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

   /* public void vyhra (View view) {
        if(editText == 48){
            Toast toast =Toast.makeText(context,text,duration);
            toast.show();
        }*/
}
