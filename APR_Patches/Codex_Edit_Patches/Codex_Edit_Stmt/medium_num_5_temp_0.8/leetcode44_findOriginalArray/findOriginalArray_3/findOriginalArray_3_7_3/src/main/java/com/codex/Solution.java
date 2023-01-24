package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length == 0) return new int[0];
        int[] original = new int[changed.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : changed){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            for (int j = 0; j<entry.getValue()/2; j++){
                original[index] = key;
                index++;
            }
        }
        return original;
    }


    
}