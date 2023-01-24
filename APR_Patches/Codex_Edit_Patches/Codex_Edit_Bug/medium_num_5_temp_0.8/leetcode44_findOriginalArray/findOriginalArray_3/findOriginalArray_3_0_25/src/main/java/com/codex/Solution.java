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
            }
        }
        return original;
    
    public static int findOriginalArray(int[] changed){
        
        if (changed.length % 2 != 0 ) return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : changed){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int[] original = new int[changed.length/2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 != 0) return -1;
            // System.out.println(entry.getValue());
            for (int j = 0; j<entry.getValue()/2; j++){
                original[index] = entry.getKey();
                index++;
            }
        }

        return original[0];
    }

    }


    
}