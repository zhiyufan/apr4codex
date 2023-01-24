package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

public class NumberOfPairs {
    public static int numberOfPairs(String[] nums, String target) {

        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for (String s : nums) {
            // check if HashMap contains the current string
            if (map.containsKey(s)) {
                // if it does, get the count of that string
                int c = map.get(s);
                // increment the count and put it back into the HashMap
                map.put(s, ++c);
            } else {
                // if it doesn't, then add it to the HashMap with count 1
                map.put(s, 1);
            }
        }

        for (String s : nums) {
            String secondString = target - s;
            if (map.containsKey(secondString)) {
                int c = map.get(secondString);
                if (c > 0) {
                    count++;
                    map.put(secondString, --c);
                }
            }
        }
        return count;
    } 
}
}