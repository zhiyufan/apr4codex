package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (i >= 1) {
                if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
                    count++;    
                }
            }
            if (i == 0 && street.charAt(i) == 'H') {
                count++;
            }
        }

        return count;        
    }
}