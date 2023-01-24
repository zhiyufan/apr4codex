package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        

        int count = 0 , i;
            for ( i = 0; i < street.length(); i++) {
                if (street.charAt(i) == 'H') {
                    count++;
                }
                if (street.charAt(i) != 'H' && street.charAt(i + 1) == 'H') {
                    count++;
                }
            }
        }
        return count;
    }


    
}