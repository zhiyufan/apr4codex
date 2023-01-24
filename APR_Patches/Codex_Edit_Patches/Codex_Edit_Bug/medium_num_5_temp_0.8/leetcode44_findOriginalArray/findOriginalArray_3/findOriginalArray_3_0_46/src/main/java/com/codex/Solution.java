package com.codex;

import java.util.*;

public class Solution {
public static int[] findOriginalArray(int[] changed) {
    
    if (changed.length % 2 != 0) return new int[0];
    int[] original = new int[changed.length / 2];

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : changed) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    int index = 0;
    for (Integer key : map.keySet()) {
        int value = map.get(key);
        if (value % 2 != 0) return new int[0];
        for (int j = 0; j < value / 2; j++) {
            original[index] = key;
            index++;
        }
    }
    return original;
}










public static int[][] findOriginalArray2(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[][]{};
        }
        int[] original = new int[changed.length / 2];
        int[][] result = new int[changed.length-changed.length/2][2];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < changed.length; i++) {
            List<Integer> list = map.getOrDefault(changed[i], new ArrayList<>());
            list.add(i);
            map.put(changed[i], list);
        }
        int index = 0, resultIndex = 0;
        for (Integer key : map.keySet()) {
            List<Integer> indexes = map.get(key);
            int size = indexes.size();
            if (size % 2 != 0) {
                return new int[][]{};
            }
            for (int j = 0; j < size / 2; j++) {
                original[index] = key;
                index++;
            }
            for (int j = size / 2; j < size; j++) {
                result[resultIndex][0] = original[index - 1];
                result[resultIndex][1] = indexes.get(j);
                index--;
                resultIndex++;
            }
        }

    




        return result;
    }


    
}