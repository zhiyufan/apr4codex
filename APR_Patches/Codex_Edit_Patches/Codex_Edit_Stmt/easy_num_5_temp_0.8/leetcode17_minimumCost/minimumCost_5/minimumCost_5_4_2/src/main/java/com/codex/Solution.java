package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] costs) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : costs) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }

    
}