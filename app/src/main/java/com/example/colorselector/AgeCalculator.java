package com.example.colorselector;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AgeCalculator extends AppCompatActivity {

    static int current_year = 2017;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selector);


        String[] year = new String [30];
        int counter = 0;
        String year_string;
        for (int i = 1990; i <= 2017; i++){
             year_string = Integer.toString(i);
            year[counter] = year_string;
            counter++;
        }
        Spinner spinner = (Spinner) findViewById(R.id.color);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, year);
        spinner.setAdapter(adapter);
    }

    public void onClickFindColor(View view) {


        //Get a reference to the TextView
        TextView selected = (TextView) findViewById(R.id.colorSelected);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String colorSelected = String.valueOf(color.getSelectedItem());

        selected.setText(colorSelected);

        //Assignment hint
        int age = current_year - Integer.valueOf(String.valueOf(color.getSelectedItem()));
        TextView conclusion = (TextView) findViewById(R.id.conclusion);
        String get_conclusion = "Your age is " + age;
        conclusion.setText(get_conclusion);

    }
}
