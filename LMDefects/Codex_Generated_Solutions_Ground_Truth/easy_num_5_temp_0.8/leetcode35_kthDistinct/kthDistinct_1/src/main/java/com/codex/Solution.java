package com.codex;

import java.util.*;

public class Solution {
    public static String kthDistinct(String[] arr, int k) {
        /** A distinct string is a string that is present only once in an array.
         * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
         * Note that the strings are considered in the order in which they appear in the array.
         */
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        return "";
    }

    }