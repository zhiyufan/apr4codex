package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {


        int buckets = 0;
        for (int i = 0; i < street.length(); i++) {
            if (street.charAt(i) == 'H')
                buckets += 1;
        }
        return buckets;
    }

    
}