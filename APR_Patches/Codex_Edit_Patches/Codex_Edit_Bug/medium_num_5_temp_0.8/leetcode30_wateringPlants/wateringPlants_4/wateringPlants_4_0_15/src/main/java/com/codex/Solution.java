package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) 
	{
        // Write your code here

        int steps = 0;
        int curCap = capacity;
        for (int i : plants) {
            if (i > capacity) {
                return -1;
            }
            if (curCap >= i) {
                curCap -= i;
            } else {
                curCap = capacity - i;
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

        return steps;
    }

    
}