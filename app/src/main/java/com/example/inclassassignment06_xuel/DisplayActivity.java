package com.example.inclassassignment06_xuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity{

        private TextView displayContent;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

            Intent intent = getIntent();


            String name=intent.getStringExtra("animalName");
            String legsnumber=intent.getStringExtra("legsNumber");
            String moreInfo= intent.getStringExtra("moreInfo");
           boolean hasFurr= intent.getBooleanExtra("hasFurr",true);
            displayContent=(TextView)findViewById(R.id.displayContent);
            String message="Animal Name: "+name+"\nLegs: "+legsnumber+"\n Has Fur? "+hasFurr+"\nMore Info: "+moreInfo;
            displayContent.setText(message);
    }
}
