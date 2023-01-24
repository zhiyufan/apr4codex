package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        int res = 0, cur = 0;
        for (int i = 0; i < 32; ++i) {
            if (((start ^ goal) & (1 << i)) != 0) {
                ++res;
                cur ^= 1;
            }
            if ((goal & (1 << i)) != 0) {
                if (cur == 0)
                    ++res;
                cur ^= 1;
            }
        }
        return cur == 0 ? res : -1;
    } 
}