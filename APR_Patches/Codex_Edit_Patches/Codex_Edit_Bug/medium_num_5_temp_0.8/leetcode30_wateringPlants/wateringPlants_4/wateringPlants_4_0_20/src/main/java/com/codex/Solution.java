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
    }

    return steps;
}
}