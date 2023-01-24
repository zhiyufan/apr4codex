package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
    
    Arrays.sort(milestones);
    long ret = 0;
    int n = milestones.length;
    for (int i = n - 1; i >= 0; i--) {
        ret += Math.ceil(1.0 * (milestones[i] - n + i) / (n - i));
        if (ret >= 1000000) {
            return -1;
        }
    }

    return ret;
}
}