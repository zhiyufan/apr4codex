package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == key) {
                count = 0;
            } else {
                count++;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, count);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;
    }





public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        offset %= str.length;
        reverse(str, 0, str.length - offset - 1);
        reverse(str, str.length - offset, str.length - 1);
        reverse(str, 0, str.length - 1);
    }
    
    private void reverse(char[] str, int i, int j) {
        while (j > i) {
            char tmp = str[j];
            str[j] = str[i];
            str[i] = tmp;
            i++;
            j--;
        }
    }
    
}