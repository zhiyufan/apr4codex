package com.codex;

import java.util.*;

public class Solution {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        
        int count = 0;
        for (int i = 0; i < q.length; i++) {
            if (i - 1 >= 0 && q[i - 1] > q[i]) {
                count++;
                continue;
            }
            if (i - 2 >= 0 && q[i - 2] > q[i]) {
                count += 2;
                continue;
            }
        }
        System.out.println(count);

    }

    
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
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