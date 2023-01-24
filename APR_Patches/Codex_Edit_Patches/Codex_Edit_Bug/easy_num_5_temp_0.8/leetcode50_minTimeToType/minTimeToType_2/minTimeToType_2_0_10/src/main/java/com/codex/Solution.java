package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String str) {
        

                if (str == null || str.length() == 0) {
            return 0;
        }

        int res = 0, len = str.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
            int next = str.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}