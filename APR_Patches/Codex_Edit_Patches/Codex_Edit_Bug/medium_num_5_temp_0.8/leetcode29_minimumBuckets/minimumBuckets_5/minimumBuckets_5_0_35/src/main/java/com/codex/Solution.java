package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

        int count = 0;
        for (int i = 0; i < street.length(); i++) {

            if (i < street.length() - 1 && street.charAt(i) == 'H' && street.charAt(i + 1) != 'H')
                count += 2;
            else if (street.charAt(i) == 'H' && street.charAt(i + 1) == 'H')
                count += 1;
            
        }
        return count;
    }


    
}