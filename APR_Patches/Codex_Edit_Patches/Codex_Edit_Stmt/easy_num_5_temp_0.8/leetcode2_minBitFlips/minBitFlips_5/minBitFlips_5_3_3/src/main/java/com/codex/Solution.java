package com.codex;

import java.util.*;

public class Solution {
    public int minFlips(String target) {
        int flips = 0;
        char last = '0';
        for (char c : target.toCharArray()) {
            if (c == last) {
                continue;
            }
            flips++;
            last = c;
        }
        return count;
    }

    
}