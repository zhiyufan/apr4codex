package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int ans = 0;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int b1 = (start >> i) & 1;
            int b2 = (goal >> i) & 1;
            if (b1 == b2)
                continue;
            if (count % 2 == 0)
                ans++;
            else
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}