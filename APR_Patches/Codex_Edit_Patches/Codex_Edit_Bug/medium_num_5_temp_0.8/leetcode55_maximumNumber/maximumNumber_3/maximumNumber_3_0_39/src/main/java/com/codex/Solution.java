package com.codex;

import java.util.*;

public class Solution {
    public static int maximum(int[] change) {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            while(change[i] > 0) {
                res += i;
                change[i]--;
            }
        }
        return res;
    }
}