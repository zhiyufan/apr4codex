package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minBitFlips(int[] a) {
        int start = 0;
        int count = 0; 
        int goal = a.length;
        while (start < goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (start == (goal ^ (1 << start))) {
                    return -1;
                }
                start ^= 1 << start;
            }
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }

}
}