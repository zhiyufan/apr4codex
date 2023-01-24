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
        for (int i = 0; i < list.size()-1; i++) {
            if (i % 3 == 2) {
                continue;
            }
            System.out.println(list.get(i));
            res += list.get(i);
            System.out.println(res);
        }
        return res;
    }

    
}