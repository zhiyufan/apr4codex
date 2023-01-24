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

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return null;
        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);list2.add(1);
        allRows.add(list1);
        allRows.add(list2);
        for (int i = 2; i<=rowIndex; i++){
            List<Integer> cur = allRows.get(i-1);
            List<Integer> prev = allRows.get(i-2);
            List<Integer> next = new ArrayList<>();
            for (int j = 0; j<=i; j++){
                if (j == 0 || j == i) {
                    next.add(1);
                }
                else{
                    int sum = cur.get(j-1) + cur.get(j);
                    next.add(sum);
                }
            }
            allRows.add(next);
        }
        return allRows.get(rowIndex);
    }


        return original;
    }


    
}