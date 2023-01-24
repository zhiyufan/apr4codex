package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        int[] input = {2, 4, 5, 1, 2};
        System.out.println(wateringPlants(input, 6));
    }

    private static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;

                }
            }
        }

        return steps;
    }

}
}