package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currWater = 0;
        if (plants[0] > currWater) {
            steps += plants[0];
            currWater = capacity;
        } else {
            currWater += capacity - plants[0];
        }
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > currWater) {
                steps += (i) * 2;
                currWater = capacity;
            } else {
                currWater -= plants[i];
            }
        }
        return steps + currWater;
    }
}