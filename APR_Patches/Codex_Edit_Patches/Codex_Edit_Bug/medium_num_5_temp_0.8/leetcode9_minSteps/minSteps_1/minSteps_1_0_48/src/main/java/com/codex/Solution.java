package com.codex;

import java.util.*;

public class Solution {
    public static int numJewelsInStones(String J, String S) {
        
        int res = 0;
        char[] jArr = J.toCharArray();
        char[] sArr = S.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < jArr.length; j++) {
                if (sArr[i] == jArr[j]) {
                    res++;
                    break;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(sCount[i] - tCount[i]);
        }
        return res / 2;
    }

    
}