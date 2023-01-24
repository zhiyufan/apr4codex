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

	public static int[] findOriginalArray(int[] changed) {
        if (changed.length%2 != 0 || changed.length == 0) return new int[0];

        int[] original = new int[changed.length/2];
        int[] copy = new int[changed.length];
        for (int i = 0; i<changed.length; i++){
            copy[i] = changed[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i<copy.length-1; i+=2){
            if (copy[i] != copy[i+1]) {
                return new int[0];
            }
            else{
                original[index] = copy[i];
                index++;
            }
        }
        return original;
    }
    }


    
}