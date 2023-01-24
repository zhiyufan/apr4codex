package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        int count = 0;

        char[] streetCharArr = street.toCharArray();
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {                
                if (i -1 >= 0 && streetCharArr[i - 1] == '.') {
                    streetCharArr[i - 1] = 'B';
                    count++;
                }
            }
        }
        return count;
    }

    
}