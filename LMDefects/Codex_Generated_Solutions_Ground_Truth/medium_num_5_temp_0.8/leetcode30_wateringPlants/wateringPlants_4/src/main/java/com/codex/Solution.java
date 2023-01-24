package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        /** You want to water n plants in your garden with a watering can. The plants are arranged in a row and are labeled from 0 to n - 1 from left to right where the ith plant is located at x = i. There is a river at x = -1 that you can refill your watering can at.
         * Each plant needs a specific amount of water. You will water the plants in the following way:
         * Water the plants in order from left to right.
         * After watering the current plant, if you do not have enough water to completely water the next plant, return to the river to fully refill the watering can.
         * You cannot refill the watering can early.
         * You are initially at the river (i.e., x = -1). It takes one step to move one unit on the x-axis.
         * Given a 0-indexed integer array plants of n integers, where plants[i] is the amount of water the ith plant needs, and an integer capacity representing the watering can capacity, return the number of steps needed to water all the plants.
         */

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps += 2*i-1;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps += 2*(i+1);
                }
            }
        }

        return steps;
    }

    }