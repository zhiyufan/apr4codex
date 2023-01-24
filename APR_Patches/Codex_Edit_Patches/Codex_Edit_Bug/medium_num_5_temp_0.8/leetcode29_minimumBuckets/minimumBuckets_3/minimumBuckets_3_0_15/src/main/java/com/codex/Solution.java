package com.codex;

import java.util.*;

public class Solution {
    /**
     * 
     * @param street
     * @return
     */
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        if (i - 2 >= 0) {
                            if (streetCharArr[i - 2] == '.') {
                                streetCharArr[i - 1] = 'B';
                                count++;
                            }
                        } else {
                            streetCharArr[i - 1] = 'B';
                            count++;
                        }
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        if (i + 2 < streetCharArr.length) {
                            if (streetCharArr[i + 2] == '.') {
                                streetCharArr[i + 1] = 'B';
                                count++;
                            }
                        } else {
                            streetCharArr[i + 1] = 'B';
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    
}