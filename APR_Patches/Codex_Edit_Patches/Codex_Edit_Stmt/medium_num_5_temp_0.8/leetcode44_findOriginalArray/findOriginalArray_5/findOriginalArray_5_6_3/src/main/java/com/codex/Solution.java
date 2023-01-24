package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] res = new int[changed.length / 2];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0); //以前一直写成cache.get(num). 这里如果map里没有num这个key,那么获取数据会报错,哪怕有默认值,也没有用.
            cache.put(num, count + 1);
        }

        int index = 0;
        for (int k : cache.keySet()) {
            int v = cache.get(k);
            if (v % 2 != 0) {
                return new int[0];
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }

    
}