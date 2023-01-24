package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

        if (street.length() == 0)
            return 0;
        

        char[] streetCharArr = street.toCharArray();
        int count = 0, i = 0;

        if (streetCharArr[0] == 'H')
            count++;
            

        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0 && streetCharArr[i - 1] == '.') {
                    streetCharArr[i - 1] = 'B';
                    count++;
                }

                if (i + 1 < streetCharArr.length && streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;

            if (streetCharArr[i] == '.' && i + 1 < streetCharArr.length) {
                if (streetCharArr[i + 1] == 'H')
                    count++;
            }

                }
            }
        }
        return count;
    }

    
}