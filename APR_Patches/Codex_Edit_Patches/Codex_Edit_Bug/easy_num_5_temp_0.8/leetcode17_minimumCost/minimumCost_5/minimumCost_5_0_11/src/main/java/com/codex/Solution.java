package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }
    public static int[] findInRunLengthEncoded(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return new int[] {i, i};
            }
            if (a[i] > target) {
                return new int[] {i, i - 1};
            }
        }
        return new int[] {-1, -1};
    }

    
    
}