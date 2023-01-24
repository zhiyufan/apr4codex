package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i, temp;
        i = 0;
        int position = 0;
        int steps = 0;
        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            if (position < 0) {
                steps++;
                position = 0;
            }
            if (plants[i] > (capacity - position)) {
                steps++;
                if ((capacity - plants[i]) > 0) {
                    temp = plants[i];
                    while (plants[i] == temp) {
                        i++;
                    }
                    i--;
                }
                position = 0;  
            }
            else {
                position += plants[i];
                steps++;
            }
            i++;
        }
        return steps;
    }

    
}