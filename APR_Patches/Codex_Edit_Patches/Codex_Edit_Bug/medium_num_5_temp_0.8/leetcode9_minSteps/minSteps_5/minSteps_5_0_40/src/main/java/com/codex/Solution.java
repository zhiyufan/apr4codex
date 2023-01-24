package com.codex;

import java.util.*;

public class Solution {
public static int minSteps(String s, String t) {
        // create a array with 26 elements
        int[] hash = new int[26];
        // for each element in the string s
        for (int i = 0; i < s.length(); i++) {
            // increment the count of the index of the element
            hash[s.charAt(i) - 'a']++;
        }
        // initialize the step
        int step = 0;
        // for each element in the string t
        for (int i = 0; i < t.length(); i++) {
            // if the count of the index is 0
            if (hash[t.charAt(i) - 'a'] == 0) {
                // increment the step
                step++;
            } else {
                // decrement the count of the index
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }
}