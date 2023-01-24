package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int buckets = 0;
        int i = 1;
        buckets += (street.charAt(0) == 'H') ? 1 : 0;
        while (i < street.length()) {      
            if (street.charAt(i) == 'H' && street.charAt(i - 1) != 'H') {
            i++;
                buckets++;
            }
        }
        return buckets;
    }

    
}