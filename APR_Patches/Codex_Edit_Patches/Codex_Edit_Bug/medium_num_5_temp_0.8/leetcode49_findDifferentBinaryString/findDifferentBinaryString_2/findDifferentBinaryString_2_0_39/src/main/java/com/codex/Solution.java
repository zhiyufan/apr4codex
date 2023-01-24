package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        int N = nums.length;
        int M = nums[0].length();
        int[][] nums2d = new int[N][M];
        for (int i = 0; i < N; ++i){
            for (int j = 0; j < M; ++j) {
                nums2d[i][j] = nums[i].charAt(j) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }

    
}