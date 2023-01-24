package com.codex;

import java.util.*;

public class Solution {
    	public static int[] findOriginalArray(int[] changed) {
		
		// if changed array is empty return empty array
		if (changed.length == 0) return new int[0];
		
		// create the map for counting and the original array
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] original = new int[changed.length];
        int count = 0;

            map.put(i, map.getOrDefault(i,0) + 1);  
        }
        
        // check if there is odd number of any element in the map and that there are no more then one element with odd number in the changed array
        int countOdd = 0;
        int oddElement = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 != 0 ){
                countOdd++;
                oddElement = entry.getKey();
                if (countOdd > 1) return new int[0];
            }
        }
        
        // fill the original array
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