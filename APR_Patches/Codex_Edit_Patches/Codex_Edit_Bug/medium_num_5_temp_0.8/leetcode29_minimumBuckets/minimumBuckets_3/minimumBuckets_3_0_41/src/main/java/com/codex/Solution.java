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


       public static boolean checkIfAllAsAreSorted(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 'A' && arr[i + 1] == 'A') {
                return false;
            }
        }
        return true;
    }
    }
    public static int minimumBuckets(String s) {
        char[] streetCharArr = s.toCharArray();
        int count = 0;
        while (!checkIfAllAsAreSorted(streetCharArr)) {
            for (int i = 0; i < streetCharArr.length; i++) {
                if (streetCharArr[i] == 'H') {
                    if (i - 1 >= 0) {
                        if (streetCharArr[i - 1] == 'A') {
                            streetCharArr[i - 1] = 'B';
                            count++;
                        }
                    }
                    if (i + 1 < streetCharArr.length) {
                        if (streetCharArr[i + 1] == 'A') {
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