package com.codex;

import java.util.*;

public class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> list = new ArrayList<>();
        if (security == null || security.length == 0 || time <= 0) return list;

        int n = security.length;
        int[] rob = new int[n];
        int[] noRob = new int[n];
        rob[1] = security[1];
        for (int i = 2; i <= time; i++) rob[i] = Math.max(rob[i - 1], noRob[i - 1] + security[i]);
        for (int i = time + 1; i < n; i++) {
            rob[i] = Math.max(rob[i - 1], noRob[i - 1] + security[i]);
            noRob[i] = Math.max(noRob[i - 1], rob[i - 1]);
        }    
        // rob[n - 1] means rob the bank in the last day;
        // if(noRob[n - 1] == rob[n - 1]) means no bank rob in the range.
        if(noRob[n - 1] == rob[n - 1]) return list;
        
        int index = n - 1;
        while (index > time) {
            if (noRob[index] == rob[index]) {
                list.add(index);
                index--;
            } else if (noRob[index - 1] == rob[index]) {
                index--;
            } else {
                index -= 2;
            }
        }
        for (int i = 0; i < time; i++) {
            if (security[i] > security[i + 1]) list.add(i);
        }
        return list;
    }
}