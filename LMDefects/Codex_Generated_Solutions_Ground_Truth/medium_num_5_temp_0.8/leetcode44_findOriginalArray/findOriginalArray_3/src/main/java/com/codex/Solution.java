package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        /** An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.
         * Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
         */
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
    }


    }