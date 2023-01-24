package com.codex;

import java.util.*;

public class Solution {
 def equal():
    t = int(input())
    for i in range(t):
        n = int(input())
        val = list(map(int, input().split()))
        val.sort(reverse=True)
        cnt = 0
        while (val[0] != val[n - 1]):
            cnt += 1
            val[0] -= 1
            val[n - 1] += 1
            for j in range(n - 1):
                if (val[j] < val[j + 1]):
                    val[j], val[j + 1] = val[j + 1], val[j]
            for j in range(n - 1):
                if (val[j] < val[j + 1]):
                    val[j], val[j + 1] = val[j + 1], val[j]
        print(cnt)






    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0; 
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}