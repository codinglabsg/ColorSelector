package com.example.colorselector;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class ColorSelectorEnhance extends AppCompatActivity {

   // static int current_year = 2017;

    private ColorExpert expert = new ColorExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selector);
        Spinner spinner = (Spinner) findViewById(R.id.color);
    }

    public void onClickFindColor(View view) {
        //Get a reference to the TextView
        TextView selected = (TextView) findViewById(R.id.colorSelected);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String colorSelected = String.valueOf(color.getSelectedItem());

        selected.setText(colorSelected);


        //get the color code from ColorExpert
        int get_color = expert.getColor(colorSelected);
        selected.setTextColor(get_color);

        //Get recommendations from the ColorExpert class
        String get_conclusion = expert.getConclusion(colorSelected);
        TextView conclusion = (TextView) findViewById(R.id.conclusion);
       // conclusion.setText(get_conclusion);

        //Exercise 3 - add on
        //Get the list from Spinner and convert to text
        StringBuffer all_colors = new StringBuffer("The list has following colors:");
        for (int i=0; i< color.getAdapter().getCount(); i++){
            all_colors.append(String.valueOf(color.getAdapter().getItem(i)));
            all_colors.append(", ");
        }

        get_conclusion = all_colors.toString() + get_conclusion;
        conclusion.setText(get_conclusion);

        //Assignment hint
        //int age = current_year - Integer.valueOf(String.valueOf(color.getSelectedItem()));
        //TextView conclusion = (TextView) findViewById(R.id.conclusion);
        //String get_conclusion = "Your age is " + age;
        //conclusion.setText(get_conclusion);

    }
}
