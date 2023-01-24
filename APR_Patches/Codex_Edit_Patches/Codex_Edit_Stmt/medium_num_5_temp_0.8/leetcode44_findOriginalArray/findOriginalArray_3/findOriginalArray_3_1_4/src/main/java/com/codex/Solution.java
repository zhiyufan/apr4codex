package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length%2 != 0) return new int[0];
        int[] original = new int[changed.length/2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : changed){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int index = 0;
        map.forEach((key,value) -> {
            if (value % 2 != 0) return new int[0];
            
            for (int j = 0; j<value/2; j++){
                original[index++] = key;
            }               
        });
        return original;
    }


    
}