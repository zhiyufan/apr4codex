package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = cost.length - 2; i >= 0; i--) {
            if ((cost.length - 1 - i) % 2 == 1) {
                continue;
            }
            res += list.get(list.size() - i - 1);
        }
        return res;
    }

    
}