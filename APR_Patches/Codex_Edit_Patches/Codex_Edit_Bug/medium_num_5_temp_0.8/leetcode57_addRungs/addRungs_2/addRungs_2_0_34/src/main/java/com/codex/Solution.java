package com.codex;

import java.util.*;

public class Solution {
int addRungs(int[] rungs, int dist) {
    int add = 0;
    for (int i = 1; i < rungs.length; ) {
        int cur = rungs[i];
        rungs[i] = Math.max(cur, rungs[i - 1] + dist);
        add += rungs[i] - cur;
        i++;
    }
    return add;
}
}