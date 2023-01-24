package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
//            if (streetCharArr[i] == 'H') {
//                if (i - 1 >= 0) {
//                    if (streetCharArr[i - 1] == '.') {
//                        streetCharArr[i - 1] = 'B';
//                        count++;
//                    }
//                }
//                if (i + 1 < streetCharArr.length) {
//                    if (streetCharArr[i + 1] == '.') {
//                        streetCharArr[i + 1] = 'B';
//                        count++;
//                    }
//                }
//            }
            if (i - 1 >= 0) {
                if (streetCharArr[i] == 'H') {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B'; 
                    }
                }
                if (streetCharArr[i] == 'H') {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B'; 
                    }
                }
            }
            
       
            
        }
         for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'B') count++;
        }
        return count; 
        
    }

    
}