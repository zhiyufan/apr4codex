package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        int steps = 0;
        while (i < plants.length) {
            System.out.println("plant value :" + plants[i]);
            System.out.println("Position :" + position);
            if (plants[i] > capacity) {
                return -1;
            }
            if (position > 0 && capacity - position < plants[i]) {
                steps++;
                position = 0;
                System.out.println("Steps :" + steps);
            } else if (plants[i] > capacity - position) {
                steps++;
                position = 0;
                System.out.println("Steps :" + steps);
            } else {
                position += plants[i];
                steps++;
                System.out.println("Steps :" + steps);
            }
            position += plants[i];
            steps++;
            i++;
        }
        return steps;
    }

    
}