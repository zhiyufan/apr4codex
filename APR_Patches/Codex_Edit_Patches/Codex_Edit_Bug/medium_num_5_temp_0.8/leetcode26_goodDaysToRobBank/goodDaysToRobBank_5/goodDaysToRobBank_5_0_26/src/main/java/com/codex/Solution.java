package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> goodDaysToRobBank(int[] security, int time) {
    
    List<Integer> result = new ArrayList<>();
    if (security == null || security.length == 0 || time <= 0) return result;

    if (time == 1) {
        for (int i = 0; i < security.length - 1; i++) {
            if (security[i] >= security[i + 1]) result.add(i);
        }
        return result;
    }
    
    for (int i = 2; i < secuirty.length; i++) {
        if (security[i] > security[i - 1] && security[i] > security[i - 2]) {
            goodDays.add(i);
        }
    }

    return result;
}
}