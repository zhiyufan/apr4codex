package com.codex;

import java.util.*;

public class Solution {
    import java.util.Arrays;

    public static long smallestNumber(long num) {
        
        char []arr = String.valueOf(num).toCharArray();
        int n = arr.length;
         
        int ind = -1;
        for (int i = 0; i<n-1; i++){
            if (arr[i] > arr[i+1]){
                ind = i;
                break;
            }
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}