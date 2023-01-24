package com.codex;

import java.util.*;

public class Solution {
public int countElements(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++) {
        if(!map.containsKey(arr[i])) {
            map.put(arr[i], 1);
        }
    }
    int count = 0;
    for(int i = 0; i < arr.length; i++) {

        if(map.containsKey(arr[i] + 1)) {
            count++;
        }
    }
    return count;
}
        
}