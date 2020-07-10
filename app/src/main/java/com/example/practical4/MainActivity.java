package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public <string> void show(View view)
    {
        CheckBox chk1 = (CheckBox) findViewById(R.id.Chocolate_syrup);
        CheckBox chk3 = (CheckBox) findViewById(R.id.Crushed_nuts);
        CheckBox chk5 = (CheckBox) findViewById(R.id.orio_cookies_crumbles);
        CheckBox chk2 = (CheckBox) findViewById(R.id.sprinkles);
        CheckBox chk4 = (CheckBox) findViewById(R.id.cherries);
        String msg =  "Toppings: ";
        if (chk1.isChecked()){
            msg += "Chocolate syrup" + " ";

        }
        if (chk2.isChecked()){
            msg += "Sprinkles" + " ";

        }
        if (chk3.isChecked()){
            msg += "Crushed nuts" + " ";

        }
        if (chk4.isChecked()){
            msg += "Cherries" + " ";

        }
        if (chk5.isChecked()){
            msg += "Orio cookies crumble" + " ";

        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}