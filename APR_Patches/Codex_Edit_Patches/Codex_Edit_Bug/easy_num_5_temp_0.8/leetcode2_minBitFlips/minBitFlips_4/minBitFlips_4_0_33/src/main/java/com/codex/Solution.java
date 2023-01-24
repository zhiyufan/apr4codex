package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        char[] startArr = Integer.toBinaryString(start).toCharArray();
        char[] goalArr = Integer.toBinaryString(goal).toCharArray();
        int res = 0;
        int consecutive = 0;
        int i = startArr.length-1;
        int j = goalArr.length-1;
        for(; i >= 0 && j >= 0; i--, j--) {
            if(startArr[i] != goalArr[j]) {
                consecutive ^= 1;
                res += consecutive;
            } else {
                if(startArr[i] == '0')
                    consecutive = 0;
            }
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}