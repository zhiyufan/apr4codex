package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }

    public static String[] addBorder(String[] picture) {

        String[] borderPicture = new String[picture.length + 2];
        int lenght = picture[0].length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lenght + 2; i++) {
            sb.append("*");
        }
        for (int i = 0; i < borderPicture.length; i++) {
            if (i == 0 || i == borderPicture.length - 1) {
                borderPicture[i] = sb.toString();
            } else {
                borderPicture[i] = "*" + picture[i - 1] + "*";
            }
        }
        return borderPicture;
    }


    
    
}