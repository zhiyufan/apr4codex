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


    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = Integer.MIN_VALUE;
        int cnt =0;
        for (int num : A) {
            if (num >= max) {
                max = num;
                cnt = -1;
            }
            cnt++;
        }
        return cnt;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = Integer.MIN_VALUE;
        int cnt =0;
        for (int num : A) {
            if (num >= max) {
                max = num;
                cnt = -1;
            }
            cnt++;
        }
        return cnt;
    }
}