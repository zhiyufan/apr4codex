package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static int countLargestGroup(int n) {
        int[] count = new int[37];
        for (int i = 1; i <= n; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            int num = 0;
            for (char c : arr) {
                num += (c - '0');
            }
            count[num]++;
        }
        int max = 0;
        int res = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                res = 1;
            } else if (count[i] == max) {
                res++;
            }
        }
        return res;
    }

    

    
}