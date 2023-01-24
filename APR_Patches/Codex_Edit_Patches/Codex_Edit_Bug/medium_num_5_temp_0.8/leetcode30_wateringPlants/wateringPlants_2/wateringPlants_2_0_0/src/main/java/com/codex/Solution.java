package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
    
    int steps = 0;
    int i = 0;
    int x = -1;
    int water = capacity;
    while (i < plants.length) {
        if (x >= 0) {
            if (water < plants[i]) {
                steps++;
                water = capacity - plants[i];
                i++;
                x++;
                System.out.println("1:" + "water:" + water + " i:" + i + " x:" + x + " steps:" + steps);
            } else {
                steps++;
                water -= plants[i];
                i++;
                x++;
                System.out.println("2:" + "water:" + water + " i:" + i + " x:" + x + " steps:" + steps);
            }
        } else {
            water = capacity;
            steps++;
            x = 0;
            if (water < plants[i]) {
                water = capacity - plants[i];
                System.out.println("3:" + "water:" + water + " i:" + i + " x:" + x + " steps:" + steps);
                i++;
                x++;
            } else {
                water -= plants[i];
                System.out.println("4:" + "water:" + water + " i:" + i + " x:" + x + " steps:" + steps);
                i++;
                x++;
            }
        }
        return steps;
    }
}