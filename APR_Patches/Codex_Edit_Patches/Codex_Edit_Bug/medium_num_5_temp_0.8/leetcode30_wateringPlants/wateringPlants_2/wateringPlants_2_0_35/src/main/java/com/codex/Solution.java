package com.codex;

import java.util.*;

public class Solution {
//Solution 1 O(n)
    public static int wateringPlants(int[] plants, int capacity) {
    int start = 0;
    int end = plants.length - 1;
    int steps = 0;
    while (start <= end) {
        if (start == end) {
            steps++;
            break;
        }
        if (plants[start + 1] <= plants[start]) {
            start++;
            steps++;
        } else {
            break;
        }
    }
    while (end >= start) {
        if (end == start) {
            steps++;
            break;
        }
        if (plants[end - 1] <= plants[end]) {
            end--;
            steps++;
        } else {
            break;
        }
    }
    int water = capacity;
    for (int i = start; i < end; i++) {
        if (water < plants[i]) {
            steps++;
            water = capacity;
            i--;
        } else {
            steps++;
            water -= plants[i];
        }
    }
    return steps;
}

//Solution 2 O(n)
 public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}