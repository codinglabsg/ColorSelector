package com.example.colorselector;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
//import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ColorSelectorActivity extends AppCompatActivity {

    static int current_year = 2017;

    private ColorExpert expert = new ColorExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selector);

        //String[] colors = new String[]{"Red", "Yellow", "Green", "White"};
        /*String[] year = new String [30];
        int counter = 0;
        String year_string;
        for (int i = 1990; i <= 2017; i++){
             year_string = Integer.toString(i);
            year[counter] = year_string;
            counter++;
        } */
        //Spinner spinner = (Spinner) findViewById(R.id.color);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, year);
        //spinner.setAdapter(adapter);
    }

    public void onClickFindColor(View view) {


        //Get a reference to the TextView
        TextView selected = (TextView) findViewById(R.id.colorSelected);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String colorSelected = String.valueOf(color.getSelectedItem());

        selected.setText(colorSelected);


        if (colorSelected.equals("Red")) {
            selected.setTextColor(Color.RED);
        }else if
         (colorSelected.equals("Yellow")) {
            selected.setTextColor(Color.YELLOW);
        }
        else if (colorSelected.equals("Green")) {
            selected.setTextColor(Color.GREEN);
        }
        else if (colorSelected.equals("White")){
            selected.setTextColor(Color.WHITE);
        }



         //Assignment hint
        //int age = current_year - Integer.valueOf(String.valueOf(color.getSelectedItem()));
        //TextView conclusion = (TextView) findViewById(R.id.conclusion);
        //String get_conclusion = "Your age is " + age;
        //conclusion.setText(get_conclusion);

    }
}
