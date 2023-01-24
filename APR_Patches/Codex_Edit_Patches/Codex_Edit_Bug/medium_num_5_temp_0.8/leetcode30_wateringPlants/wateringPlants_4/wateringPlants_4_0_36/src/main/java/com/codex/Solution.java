package com.codex;

import java.util.*;

public class Solution {
    import java.util.ArrayList;
import java.util.List;

public class Solution {

    static int[] plants = { 2, 4, 5, 1, 2 };
    static int cap = 6;

    public static void main(String[] args) {
        System.out.println(wateringPlants(plants, cap));
    }

    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int curCap = capacity;
        List<Integer> passList = new ArrayList<>();
        

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;


                curCap = capacity;
                steps += j;

            } else {
                passList.add(i);


            if (curCap < plants[i] && !passList.isEmpty()) {

                int j = 0;

                while (passList.contains(i)) {
                    j++;
                }
            }
        }

        return steps;
    }

    }
}