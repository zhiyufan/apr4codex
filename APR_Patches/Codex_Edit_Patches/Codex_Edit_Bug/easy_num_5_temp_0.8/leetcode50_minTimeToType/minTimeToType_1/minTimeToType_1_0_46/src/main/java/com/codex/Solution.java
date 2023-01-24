package com.codex;

import java.util.*;

public class Solution {
    private void handle(int[] count, int num) {
        if (num == 0) {
            count[0]++;
            return;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}