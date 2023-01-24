package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        int maxWater = 0;
        int count = 1;
        for (int i = 0; i < street.length(); i++) {
            if (street.charAt(i) == 'H') {
                if (i != 0 && street.charAt(i - 1) == 'H') {
                    count++;
                }
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
                count++;
            }
        }
        return count;
    }


    
}