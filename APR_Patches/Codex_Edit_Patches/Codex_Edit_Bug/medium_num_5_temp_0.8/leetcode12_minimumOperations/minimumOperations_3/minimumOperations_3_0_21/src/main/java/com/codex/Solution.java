package com.codex;

import java.util.*;

public class Solution {
    public static int numTimesAllBlue(int[] light) {
        
        if (light.length == 1) {
            return 1;
        }
        
        int[] sorted = new int[light.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = light[i];
        }
        
        Arrays.sort(sorted);
        
        int left = 0;
        int right = 0;
        
        int result = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == left + 1 && sorted[i] == right + 1) {
                result += 1;
            }
            else if (sorted[i] == right + 1) {
                result += 1;
            }
            
            left = Math.max(left, sorted[i] - 1);
            right = Math.max(right, sorted[i]);
            
            if (left >= sorted.length - 1) {
                result += 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] light = {4,1,2,3};
        System.out.println(numTimesAllBlue(light));
    }

    
}