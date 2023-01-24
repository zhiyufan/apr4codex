package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0, bucket = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        if (streetCharArr[i - 2] != 'B') {
                            streetCharArr[i - 1] = 'B';
                            count++;
                        }
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        if (streetCharArr[i + 2] != 'B') {
                            streetCharArr[i + 1] = 'B';
                            count++;
                        }
                    }
                }
            }
        }
        if (count % 2 == 0) {
            bucket = count / 2;
        } else {
            int oddCount = count - count / 2;
            if (oddCount > 1) {
                bucket = (count - 1) / 2;
            } else {
                bucket = count;
            }
        }
        return bucket;
    }

    
}