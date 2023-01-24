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




    LINK: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/


    public static int capacity(int[] arr, int day) {
            int sum = 0;
            int biggest = 0;
            int steps = 0;
            int i = 0;
            while(i < arr.length){
                steps++;
                if(steps > day) return -1;
                if(sum + arr[i] > biggest){
                    biggest = sum + arr[i];
                }
                sum += arr[i];
                if(sum > biggest){
                    biggest = sum;
                } if(sum == biggest){
                    sum = 0;
                    steps = 0;
                }
                i++;
            }
            return biggest;
        }
}