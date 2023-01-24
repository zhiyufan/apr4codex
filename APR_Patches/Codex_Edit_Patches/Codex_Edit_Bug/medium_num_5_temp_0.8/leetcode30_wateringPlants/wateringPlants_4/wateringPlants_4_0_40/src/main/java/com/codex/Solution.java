package com.codex;

import java.util.*;

public class Solution {
        

    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }




    public static int levelingThePlane(int[] a) {
        
        int sum = 0;
        for (int element : a) 
            sum += element; 

        int n = a.length;
        int target = sum / n;

        if (sum % n != 0)
            return -1;

        int res = 0;
        for (int i = 0; i < n; ++i) 
            res += Math.abs(a[i] - target);

        return res / 2;
    }
        return steps;
    }

    
}