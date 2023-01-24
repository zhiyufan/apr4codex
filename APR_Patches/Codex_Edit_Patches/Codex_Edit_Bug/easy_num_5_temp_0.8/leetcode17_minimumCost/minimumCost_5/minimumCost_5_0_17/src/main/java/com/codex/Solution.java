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
        int i = 0;
        while (true) {
            if (i % 3 != 2) {
                res += list.get(i);
            } else {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }

    
}