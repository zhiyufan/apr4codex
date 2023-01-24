package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        int count = 0;
        int pos = 0;
        while (pos < plants.length) {
            if(plants[pos] > capacity) {
                return -1;
            }
        }
        return steps;
    }
}