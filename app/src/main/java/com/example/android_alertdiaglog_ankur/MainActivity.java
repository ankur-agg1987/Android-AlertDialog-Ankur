package com.example.android_alertdiaglog_ankur;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAlertDialog(View view) {
        Log.d("mylog","inside button click function");
        AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
        ad.setTitle("My Alert Dialog");
        ad.setMessage("this is my first alert dialog window on click of button");
        ad.setIcon(R.drawable.google);

        ad.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Positive button clicked",Toast.LENGTH_SHORT).show();
            }
        });

        ad.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Negative button clicked",Toast.LENGTH_SHORT).show();
            }
        });

        ad.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Neutral button clicked",Toast.LENGTH_SHORT).show();
            }
        });


        ad.show();
    }
}