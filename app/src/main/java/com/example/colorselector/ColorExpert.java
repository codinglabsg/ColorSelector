package com.example.colorselector;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class ColorExpert {


    String getConclusion(String color) {
        String selectedColor = null;
        if (color.equals("Red")) {
            selectedColor = "I just selected Red";
        }
        if (color.equals("Yellow")) {
            selectedColor = "I just selected Yellow";
        }
        if (color.equals("Green")) {
            selectedColor = "I just selected Green";
        }
        if (color.equals("White")) {
            selectedColor = "I just selected White";
        }
        return selectedColor;
    }

    int getColor(String color){
        int selectedColor = 0;
        if (color.equals("Red")) {
            selectedColor = Color.RED;
            //selectedColor = Color.parseColor("0xFF99FF");
        }
        if (color.equals("Yellow")) {
            selectedColor = Color.YELLOW;
        }
        if (color.equals("Green")) {
            selectedColor = Color.GREEN;
        }
        if (color.equals("White")) {
            selectedColor = Color.WHITE;
        }
        return selectedColor;

    }


}
