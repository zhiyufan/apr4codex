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
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 != 0) return new int[0];
            int key = entry.getKey();
            for (int j = 0; j<entry.getValue()/2; j++){
                original[index] = key;
                index++;
        int flag = 0;
        for (int i = 0; i < original.length; i++){
            for (int j = i+1; j < original.length; j++){
                if (original[i] == original[j]){
                    flag = -1;
                    break;
                }
            }
            if (flag == -1) break;
        }
        if (flag == -1) return new int[0];
            }
        }
        return original;
    }


    
}