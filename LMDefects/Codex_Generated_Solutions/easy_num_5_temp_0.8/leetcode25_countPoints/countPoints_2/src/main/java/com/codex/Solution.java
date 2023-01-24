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
        int[] rods = new int[10];
        for (int i = 0; i < rings.length(); i += 2) {
            switch (rings.charAt(i)) {
                case 'R':
                    rods[rings.charAt(i + 1) - '0'] += 4;
                    break;
                case 'G':
                    rods[rings.charAt(i + 1) - '0'] += 2;
                    break;
                case 'B':
                    rods[rings.charAt(i + 1) - '0'] += 1;
                    break;
            }
        }
        int count = 0;
        for (int rod : rods) {
            if (rod == 7) {
                count++;
            }
        }
        return count;
    }

    }