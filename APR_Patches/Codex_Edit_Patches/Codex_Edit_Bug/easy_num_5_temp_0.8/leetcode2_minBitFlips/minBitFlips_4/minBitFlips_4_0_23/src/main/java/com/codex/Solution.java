package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int[] a, int[] queries) {
        int ans = 0, flip = 0;
        for (int i = 0; i < a.length; ++i) {
            if (i >= queries[0]) {
                if (flip % 2 == 1) {
                    flip++;
                    ans++;
                } else {
                    flip++;
                }
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}