package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        List<Integer> listA = IntStream.of(A).boxed().collect(Collectors.toList());
        int[] ans = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            int index = find(listA, B[i]);
            ans[i] = index == -1 ? listA.get(0) : listA.get(index);
            listA.remove(index == -1 ? 0 : index);
        }
        return ans;
    }
    
    private int find(List<Integer> listA, int target) {
        int l = 0, r = listA.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (target > listA.get(mid)) l = mid + 1;
            else r = mid;
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }

    
}