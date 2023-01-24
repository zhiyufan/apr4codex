package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortByBits(int[] arr) {
        // 桶排
        // 统计出存放每个1的arr
        int[] count = new int[10001];
        // 统计存放0的arr
        int[] arr2 = new int[10001];
        // 每个数的1的个数
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = Integer.bitCount(arr[i]);
        }
        // 对每个1的个数进行桶排
        for (int i = 0; i < arr.length; i++) {
            arr2[count[arr[i]]]++;
        }
        int n = arr.length;
        int[] res = new int[n];
        // 桶中 反向放入数字
        for (int i = 0; i < n; i++) {
            // j为下标
            for (int j = arr2[count[arr[i]]]; j > 0; j--) {
                res[--n] = arr[i];
            }
        }
        return res;   
    }
    
}