package com.codex;

import java.util.*;

public class Solution {
    public static int countPoints(String rings) {
        /** There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
         * You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:
         * The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
         * The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
         * For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
         * Return the number of rods that have all three colors of rings on them.
         */
        int[] count = new int[10];
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';
            if (color == 'R') count[rod]++;
            else if (color == 'G') count[rod + 10]++;
            else if (color == 'B') count[rod + 20]++;
        }
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0 && count[i + 10] > 0 && count[i + 20] > 0) res++;
        }
        return res;
    }

    }