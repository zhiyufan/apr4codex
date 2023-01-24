package com.codex;

import java.util.*;

public class Solution {
public static int[][] flipAndInvertImage(int[][] A) {
    for (int i = 0; i < A.length; i++) {
        int length = A[i].length;
        for (int j = 0; j < A[i].length; j++) {
            if (A[i][j] == 1) {
                A[i][j] = 0;
            } else {
                A[i][j] = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

    
}