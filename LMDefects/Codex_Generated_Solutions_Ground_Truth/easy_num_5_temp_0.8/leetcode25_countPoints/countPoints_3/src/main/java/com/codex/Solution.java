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
        if (rings == null || rings.length() < 6) {
            return 0;
        }
        int[] rodCount = new int[10];
        for (int i = 0; i < rings.length(); i++) {
            if (rings.charAt(i) == 'R') {
                if (++rodCount[rings.charAt(++i) - '0'] == 3) {
                    return 1;
                }
            }
        }
        for (int i = 0; i < rings.length(); i++) {
            if (rings.charAt(i) == 'G') {
                if (++rodCount[rings.charAt(++i) - '0'] == 3) {
                    return 1;
                }
            }
        }
        for (int i = 0; i < rings.length(); i++) {
            if (rings.charAt(i) == 'B') {
                if (++rodCount[rings.charAt(++i) - '0'] == 3) {
                    return 1;
                }
            }
        }
        return 0}