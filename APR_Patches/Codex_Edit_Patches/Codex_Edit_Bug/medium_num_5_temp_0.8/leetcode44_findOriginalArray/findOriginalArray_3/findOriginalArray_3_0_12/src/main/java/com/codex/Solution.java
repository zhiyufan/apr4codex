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
    }





        
        if (changed.length%2 != 0) return new int[0];
        int[] original = new int[changed.length/2];

        int[] count = new int[100001];
        for (int i : changed){
            count[i] = count[i] + 1;
        }

        int index = 0;
        for (int i = 0; i<count.length; i++){
            if (count[i] % 2 != 0) return new int[0];
            for (int j = 0; j<count[i]/2; j++){
                original[index] = i;
                index++;
            }
        }
        return original;
    }


    

    
}