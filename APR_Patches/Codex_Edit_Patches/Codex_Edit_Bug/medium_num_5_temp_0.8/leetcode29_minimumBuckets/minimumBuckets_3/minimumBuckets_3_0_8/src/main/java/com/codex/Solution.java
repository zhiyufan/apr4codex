package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

        String sub1;
        String sub2;

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (i < streetCharArr.length - 1) {
                sub1 = street.substring(i, i + 2);
                if (sub1.equals("HH")) {
                    count++;
                }
            }

            if (i < streetCharArr.length - 2) {
                sub2 = street.substring(i, i + 3);
                if (sub2.equals("HHH")) {
                    count++;
                }
            }

        }
        return count;
    }

    
}