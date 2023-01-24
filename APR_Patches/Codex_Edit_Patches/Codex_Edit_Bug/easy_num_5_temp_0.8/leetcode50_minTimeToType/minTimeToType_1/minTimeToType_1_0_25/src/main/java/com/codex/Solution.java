package com.codex;

import java.util.*;

public class Solution {
    //Suganya will take minimum time to type a text when using her fingers from current position to type the next character

    public static int minTimeToComplete(String word) {
        

        int[] pos = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}