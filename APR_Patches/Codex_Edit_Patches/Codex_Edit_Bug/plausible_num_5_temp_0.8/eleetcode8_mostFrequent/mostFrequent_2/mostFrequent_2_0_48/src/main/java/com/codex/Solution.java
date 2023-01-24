package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5};
        int key = 5;
        System.out.println(mostFrequent(nums, key));
    }

    public static int mostFrequent(int[] nums, int key) {    
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == key) {
                count++;
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

    
}