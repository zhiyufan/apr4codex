package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else {
                map.put(num, 1);
            }
        }
        int index = 0;
        for (Map.Entry entry : map.entrySet()){
            if ((Integer)entry.getValue() == 1) {
                res[index++] = (Integer)entry.getKey();
                if (index == 2) {
                    break;
                }
            }
        }
        return s;
    }

    
}