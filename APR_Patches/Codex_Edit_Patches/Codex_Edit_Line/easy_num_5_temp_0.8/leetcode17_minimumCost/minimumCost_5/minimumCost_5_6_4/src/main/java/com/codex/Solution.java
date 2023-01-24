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
            }else{
                res += list.get(i);
            }
        }
        return res;
    }

    
}