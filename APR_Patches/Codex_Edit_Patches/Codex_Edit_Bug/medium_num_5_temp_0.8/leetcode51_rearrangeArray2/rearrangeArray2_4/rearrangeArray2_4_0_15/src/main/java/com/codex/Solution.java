package com.codex;

import java.util.*;

public class Solution {
   public static int[] rearrangeArray2(int[] nums) {
        int[][] a = new int[nums.length][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[2];
            a[i][0] = nums[i];
            a[i][1] = i;
        }        
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int[] index = new int[nums.length];        
        for (int i = 0; i < nums.length; i++) {
            index[i] = a[i][1];
        }        
//        Arrays.sort(index);
        int[] ans = new int[nums.length];
        int[] p = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            p[i] = i;
        }
        for (int i = 0; i < index.length; i++) {
            if (p[index[i]] > 0) {
                ans[p[index[i]]] = index[i];
                p[index[i]] = -1;
            } else {
                collect(p, index[i]);
                ans[p[index[i]]] = index[i];
            }
        }        
        return ans;
    }
    public static void collect(int[] p, int index) {
        while (p[index] != -1) {
            index = p[index];
        }
        p[index] = index;
    }
}