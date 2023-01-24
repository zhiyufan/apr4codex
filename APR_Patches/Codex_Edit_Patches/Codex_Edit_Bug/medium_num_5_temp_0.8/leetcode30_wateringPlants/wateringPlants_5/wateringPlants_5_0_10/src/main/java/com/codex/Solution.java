package com.codex;

import java.util.*;

public class Solution {
int wateringPlants(int[] plants, int capacity) {
    int n = plants.length;
    int steps = 0;
    int currPos = 0;
    int currCapacity = capacity;
    int smallestPlant = -1;
    for (int i = 0; i < n; i++) {
        if (smallestPlant == -1 || plants[i] < plants[smallestPlant]) {
            smallestPlant = i;
        }
    }
    while (currPos < n) {
        if (currCapacity < plants[currPos]) {
            currPos = smallestPlant;
            currCapacity = capacity;
            steps++;
            if (currCapacity >= plants[currPos]) {
                break;
            }
        }
    }
    while (currPos < n) {
        if (currCapacity < plants[currPos]) {
            steps++;
            currPos++;
            currCapacity = capacity;
        } else {
            currCapacity -= plants[currPos];
            currPos++;
        }
    }

    return steps;
}
}