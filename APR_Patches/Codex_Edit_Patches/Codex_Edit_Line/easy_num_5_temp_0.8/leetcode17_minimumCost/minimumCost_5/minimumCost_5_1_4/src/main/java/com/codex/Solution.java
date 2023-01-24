package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }

    
}