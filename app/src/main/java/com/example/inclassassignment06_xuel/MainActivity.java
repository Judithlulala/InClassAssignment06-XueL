package com.example.inclassassignment06_xuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.Context;
import android.view.View;



public class MainActivity extends AppCompatActivity {
   private Button submit;
   private CheckBox hasFur;
   private EditText animalName;
   private EditText legs;
   private EditText moreInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalName = (EditText) findViewById(R.id.animalName);
        legs = (EditText) findViewById(R.id.legs);
        moreInfo = (EditText) findViewById(R.id.moreInfo);
        hasFur=(CheckBox)findViewById(R.id.hasFur);


        submit = (Button) findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Display();
            }
        });
    }

    public EditText getAnimalName() {
        return animalName;
    }

    public EditText getLegs() {
        return legs;
    }

    public EditText getMoreInfo() {
        return moreInfo;
    }

    public CheckBox getHasFur() {
        return hasFur;
    }

    public void Display(){
        String name=getAnimalName().getText().toString();
        String legs=getLegs().getText().toString();
        String moreInfo=getMoreInfo().getText().toString();
        boolean hasFurr=getHasFur().isChecked();

        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

        intent.putExtra("animalName", name);
        intent.putExtra("legsNumber",legs);
        intent.putExtra("moreInfo",moreInfo);
        intent.putExtra("hasFurr",hasFurr);

        startActivity(intent);

    }

}