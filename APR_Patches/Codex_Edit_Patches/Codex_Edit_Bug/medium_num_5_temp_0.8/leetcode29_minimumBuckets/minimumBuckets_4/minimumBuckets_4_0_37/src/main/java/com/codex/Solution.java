package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        

        boolean skip = false;
        int buckets = 0;
        int i = 0;
            	if (skip == true) {
            		return -1;
            	}
        while (i < street.length()) {
            if (street.charAt(i) == 'H') {
                buckets++;
                skip = true;
            } else {
            	skip = false;
            }
        }
        return buckets;
    }

    
}