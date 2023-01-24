package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static int minimumBuckets1(String street) {

        char[] streetCharArr = street.toCharArray();
        int count = 0;
                /*if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }*/

        for (int i = 0; i < streetCharArr.length; i++) {
                    if (streetCharArr[i - 1] == 'B') {
                        continue;
                    }
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                    if (streetCharArr[i + 1] == 'B') {
                        continue;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}