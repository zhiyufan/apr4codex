package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> bucketSort(List<List<Integer>> array) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            List<Integer> list = array.get(i);
            int size = list.size();
            if (result.size() < size) {
                for (int j = result.size(); j < size; j++) {
                    result.add(new ArrayList<>());
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int index = r * n + c;
            if (!map.containsKey(index)) continue;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                toRemove.add(Arrays.hashCode(artifact));
            }
        }
        return toRemove.size();
    }

    
    
}