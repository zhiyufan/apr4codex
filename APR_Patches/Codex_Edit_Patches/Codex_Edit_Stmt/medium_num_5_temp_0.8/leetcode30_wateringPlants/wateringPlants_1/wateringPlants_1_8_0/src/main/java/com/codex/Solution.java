package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class WateringPlants {
    public static int wateringPlants(int[] plants, int capacity1, int capacity2) {

        int[] closest = new int[10000];
        int currentPos = 0;
        int time = 0;

        for (int i = 0; i < plants.length; i++) {
            closest[i] = currentPos;
            if (plants[i] <= capacity1) {
                currentPos += plants[i];
            }
            else if (plants[i] <= capacity2) {
                currentPos = plants[i];
                time++;
            }
            else {
                return -1;
            }
            position += plants[i];
            steps++;
            i++;
        }
        return steps;
    }

    
}