package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        start ^= goal;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((start & 1) == 1) {
                count++;
            }
            start >>= 1;
        }
        return count;
    }

    
}