package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int count = 0;
        for (int i = 0; i < street.length(); i++) {
            if (street.charAt(i) == 'H') {
                count++;
            }
            
        }
        return count;
    }


    
}