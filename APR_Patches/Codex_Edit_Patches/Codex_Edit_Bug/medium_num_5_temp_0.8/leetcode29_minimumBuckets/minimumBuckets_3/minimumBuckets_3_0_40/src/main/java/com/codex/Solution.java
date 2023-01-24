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
    public static void main(String[] args) {

        int result = minimumBuckets("......H..H..H......");
        System.out.println("The total minimum number of buckets is: " + result);
    }


}
}