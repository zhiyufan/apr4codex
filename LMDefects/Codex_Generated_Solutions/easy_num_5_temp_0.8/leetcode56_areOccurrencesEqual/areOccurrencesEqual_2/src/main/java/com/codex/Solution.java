package com.codex;

import java.util.*;

public class Solution {
    public static boolean areOccurrencesEqual(String s) {
        /** Given a string s, return true if s is a good string, or false otherwise.
         * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
         */

        Map<Character, Integer> letterCountMap = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(!letterCountMap.containsKey(s.charAt(i))) {
                letterCountMap.put(s.charAt(i), 1);
            } else {
                letterCountMap.put(s.charAt(i), letterCountMap.get(s.charAt(i)) + 1);
            }
        }

        int target = -1;
        for(Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            if(target == -1) {
                target = entry.getValue();
            } else {
                if(entry.getValue() != target) {
                    return false;
                }
            }
        }
        return true;
    }


    }