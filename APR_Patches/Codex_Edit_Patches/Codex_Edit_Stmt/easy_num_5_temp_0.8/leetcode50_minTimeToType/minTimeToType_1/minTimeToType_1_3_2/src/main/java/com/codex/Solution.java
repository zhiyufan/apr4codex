package com.codex;

import java.util.*;

public class Solution {
int idx = 0, res = 0;
        for (char c : word.toCharArray()) {
        	int l = (c - 'a') - idx;
        	if (l < 0) {
        		l += 26;
        	}
            res += Math.min(l, 26 - l);
            idx = c - 'a';
        }

        return res;   
}