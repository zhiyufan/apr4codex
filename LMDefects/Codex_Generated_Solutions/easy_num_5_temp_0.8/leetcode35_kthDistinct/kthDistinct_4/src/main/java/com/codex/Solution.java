package com.codex;

import java.util.*;

public class Solution {
    public static String kthDistinct(String[] arr, int k) {
        /** A distinct string is a string that is present only once in an array.
         * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
         * Note that the strings are considered in the order in which they appear in the array.
         */

        HashSet<String> set = new HashSet<String>();
        ArrayList<String> distinct = new ArrayList<String>();

        for (String s : arr) {
            if (!set.contains(s)) {
                set.add(s);
                distinct.add(s);
            }
        }

        if (distinct.size() >= k) {
            return distinct.get(k - 1);
        } else {
            return "";
        }
    }

    }