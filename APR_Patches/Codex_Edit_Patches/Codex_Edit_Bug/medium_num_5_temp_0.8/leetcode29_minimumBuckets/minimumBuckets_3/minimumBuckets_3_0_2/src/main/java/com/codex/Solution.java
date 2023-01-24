package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {


        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 1; i < streetCharArr.length - 1; i++) {
            if (streetCharArr[i] == 'H') {
                streetCharArr[i - 1] = 'B';
                count++;
            }
            if (streetCharArr[i + 1] == '.') {
                streetCharArr[i + 1] = 'B';
                count++;
            }
        }
        return count;
    }

    
}