package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

    public static int minimumBuckets(String street) {
        if(street != null && street.length() > 0){
            if(street.length() == 1 && street.charAt(0) == 'H'){
                return 1;
            }
            int buckets = 0;
            int i = 0;
            while (i < street.length()) {
                if (street.charAt(i) == 'H') {
                    buckets++;
                    i++;
                } else {
                    if (i + 1 < street.length() && street.charAt(i + 1) == 'H') {
                        buckets++;
                    }
                    i++;
                }
            }
            return buckets;
        }else {
            return 0;
        }
        

    }

    
    }
}