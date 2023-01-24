package com.codex;

import java.util.*;

public class Solution {
/**
* Given an array of integers, find the original array
* before randomly shuffling it. It must be in O(n) complexity.
* It can be assumed that the array only contains integers from
* 1 to 10 (1 <= x <= 10).
* <p>
* Example:
* <p>
* Input: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
* Output: [1, 2, 3, 4, 5]
* Input: [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5]
* Output: [1, 2, 3, 4, 5]
* Input: [1, 1, 2, 2, 1, 2, 2, 2, 1, 2]
* Output: []
*/
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
    return original;
}

public static int[] findOriginalArray(int[] changed) {
    if (changed.length%2 != 0) return new int[0];
    int[] original = new int[changed.length/2];

    // HashMap<Integer, Integer> map = new HashMap<>();
    int[] map = new int[10];
    for (int i : changed){
        map[i-1] += 1;
        // map.put(i, map.getOrDefault(i,0) + 1);
    }
    int index = 0;
    for (int i = 0; i<map.length; i++){
        if (map[i] % 2 != 0) return new int[0];
        for (int j = 0; j<map[i]/2; j++){
            original[index] = i+1;
            index++;
        }
    }
    return original;
}

public static void main(String[] args) {
    int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
    System.out.println(Arrays.toString(findOriginalArray(arr)));
    int[] arr1 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
    System.out.println(Arrays.toString(findOriginalArray(arr1)));
    int[] arr2 = {1, 1, 2, 2, 1, 2, 2, 2, 1, 2};
    System.out.println(Arrays.toString(findOriginalArray(arr2)));
}


        return original;
    }


   
}