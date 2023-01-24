package com.codex;

import java.util.*;

public class Solution {
    
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        ArrayList<Integer> tempList = new ArrayList<>(nums);
        Collections.sort(tempList);
        if (nums.get(0) == 0) {
            for (int i = 1; i < tempList.size(); i++) {
                if (tempList.get(i) != 0) {
                    tempList.set(0, tempList.get(i));
                    break;
                }
            }
        }
        n = 0;
        for (int i = 0; i < tempList.size(); i++) {
            n = 10 * n + tempList.get(i);
        }
        return n;
    }

    
}