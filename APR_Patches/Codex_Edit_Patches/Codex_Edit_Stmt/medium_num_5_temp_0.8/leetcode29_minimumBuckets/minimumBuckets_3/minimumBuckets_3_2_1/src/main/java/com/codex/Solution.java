package com.codex;

import java.util.*;

public class Solution {
public class PangramChecking {

    public static int minimumBuckets(String street) {

        char[] streetCharArr = street.toCharArray();
        boolean[] marker = new boolean[streetCharArr.length];
        int count = 0, prev = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (prev == 0) {
                    count++;
                    prev = i;
                } else if (prev != i - 1) {
                    prev = i;
                    count++;
                }
            }
        }
        return count;
    }

    
}