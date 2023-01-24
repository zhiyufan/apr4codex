package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

    public static int mostFrequent(int[] nums, int key) {
        
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            count = 1;
            if (num == key) {
                continue;
            }
            if (map.containsKey(num)) {  // 找到了，就把他的value + 当前的count值，没找到就放到map上去
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
                System.out.println(map);
            }
        }
        return maxTarget;
    }


    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 3, 2, 4, 1, 7};
        int result = mostFrequent(test, 2);
        System.out.println(result);
    }
}