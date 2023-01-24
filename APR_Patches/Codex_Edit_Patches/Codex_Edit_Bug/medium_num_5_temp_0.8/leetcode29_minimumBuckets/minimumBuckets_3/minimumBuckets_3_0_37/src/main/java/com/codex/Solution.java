package com.codex;

import java.util.*;

public class Solution {
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
    static void linearForce(String[] streets) {
        int n = streets.length;
        int[] buckets = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            buckets[i] = numBuckets(streets[i]);
            sum += buckets[i];
        }
        int[] prefix = new int[n];
        prefix[0] = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + buckets[i - 1];
        }
        int index = 0;
        while (sum > 0) {
            if (buckets[index] != 0) {
                streets[index] = streets[index].replaceFirst("H", "B");
                buckets[index]--;
                sum--;
                for (int i = index + 1; i < streets.length; i++) {
                    if (streets[i].charAt(0) == '.' && buckets[i] > 0) {
                        streets[i] = streets[i].replaceFirst(".", "B");
                        buckets[i]--;
                        sum--;
                    }
                }
            }

            index++;
            if (index >= streets.length) {
                index = 0;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(streets[i]);
        }
    }

    private static int numBuckets(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'H') {
                if (i - 1 >= 0 && chars[i - 1] == '.') {
                    count++;
                }
                if (i + 1 < chars.length && chars[i + 1] == '.') {
                    count++;
                }
            }
        }
        return count;
    }

}

    
}