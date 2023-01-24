package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String input) {
        

        int buckets = 0;
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == 'H') {
                buckets++;
                if (i + 1 < input.length() && input.charAt(i + 1) == 'H') {
                    return -1;
                }
                i++;
            } else {
                i++;
                if (i < input.length() && input.charAt(i) == 'H') {
                    buckets++;
                }
                i++;
            }
        }
        return buckets;
    }

    
}