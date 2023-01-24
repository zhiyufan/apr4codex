package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
    int position = 0;
    int steps = 0;
    for (int i = 0; i < plants.length; i++) {
        if (plants[i] > capacity) {
            return -1;
        }
        if (plants[i] > capacity - position) {
            steps++;
            position = 0;
        }
        position += plants[i];
        if (i != plants.length - 1) {
            steps++;
        }
    }

    return steps;
}
}