package com.codex;

import java.util.*;

public class Solution {

   
     
    public static int maxDistance(int[] colors) {
        int result = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            else{
                map.put(arr[i], i);
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            result = Math.max(result, Math.abs(i - map.get(arr[i])));
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
}