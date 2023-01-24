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
        for (int i = 0; i < cost.length; ) {
            for (int j = 0; j < 3; j++) {
                if (j==2) {
                    int idx = list.size()-1;
                    res += list.get(idx);
                    list.remove(idx);
                } else {
                    int idx = list.size()-1;
                    res += list.get(idx);
                    list.remove(idx);
                }
                if (list.isEmpty()) {
                    break;
                }
            }
            if (list.isEmpty()) {
                break;
            }
        }
        return res;
    }

    
}