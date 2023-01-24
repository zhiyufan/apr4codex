package com.codex;

import java.util.*;

public class Solution {
    /*
    * This is the solution to the question posed in dataexo's intern selection process
    * @author: Osayawe Erica
    * @Date: 06/12/2019
    * */
    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                currPos = smallestPlant;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    
}