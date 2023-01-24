package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street, int k) {
        

        int buckets = 0;
        int i = 0;
        while (i < street.length()) {
            if (street.charAt(i) == 'H') {
                buckets++;
                if (i + k < street.length() && street.charAt(i + k) == 'H') {
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