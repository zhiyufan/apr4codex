package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = 0;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = 0;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    public static int countTriplets(List<Long> arr, long r) {

        int output = 0;

        List<Long> z = new ArrayList<>(arr);
        Collections.sort(z);

        for (int i = 0; i < z.size() - 1; i++) {
            long a = z.get(i);
            long b = a * r;
            long c = a * r * r;

            int first = arr.indexOf(a);
            int second = arr.indexOf(b);
            int third = arr.indexOf(c);


            if (second > -1 && third > -1) {
                if (third - second == second - first) {
                    output++;
                }
            }

        }
        return output;

    }
}