package com.codex;

import java.util.*;

public class Solution {
    

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        int i = 0;
        boolean flag = true;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i - 1))) {
                    return -1;
                }
                if (flag) {
                    start ^= 1 << i - 1;
                    continue;
                }
            }
            start >>= 1;
            goal >>= 1;
            i++;
            flag = false;
        }
        return count;
    }
}