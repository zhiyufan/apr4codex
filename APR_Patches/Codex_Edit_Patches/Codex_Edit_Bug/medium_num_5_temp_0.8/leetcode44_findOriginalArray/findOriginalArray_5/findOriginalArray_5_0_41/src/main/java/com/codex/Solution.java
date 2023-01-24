package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 3, 3, 3, 3, 4, 2, 1, 5, 6, 7};
        System.out.println(Arrays.toString(findOriginalArray(nums)));
    }

    public static int[] findOriginalArray(int[] changed) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[changed.length / 2];
        int i = 0;

        // Find how many times each element is repeated
        for (int num : changed) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
         }

        for (int k : map.keySet())
            for (int j = 0; j < map.get(k) / 2; j++)
                res[i++] = k;

        return res; 

    }

    
}