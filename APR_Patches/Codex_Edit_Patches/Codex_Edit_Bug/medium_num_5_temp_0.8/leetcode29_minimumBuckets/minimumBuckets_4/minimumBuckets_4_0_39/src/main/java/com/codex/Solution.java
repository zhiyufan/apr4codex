package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        

        int buckets = 0;
        int i = 0;
        while (i < street.length()) {
            if (street.charAt(i) == 'H') {
                buckets++;
                if (i + 1 < street.length() && street.charAt(i + 1) == 'H') {
                    return -1;
                }
                i++;
            } else {
                i++;
                if (i < street.length() && street.charAt(i) == 'H') {
                    buckets++;
                }
                i++;
            }
        }
        return buckets;
    }

    
}