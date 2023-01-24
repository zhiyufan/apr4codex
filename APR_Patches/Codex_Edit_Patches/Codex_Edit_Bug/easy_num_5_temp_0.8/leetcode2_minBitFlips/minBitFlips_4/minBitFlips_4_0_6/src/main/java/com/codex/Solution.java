package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minBitFlips(int[] A) {
        int flip = 0;
        int res = 0;
        int len = A.length;
        int[] flipA = new int[len];
        for (int i = 0; i < len; i++){
            res += flipA[i] ^ flip ^ A[i];
            if (i < len - 1 && (A[i] + flipA[i] + flip) == 2) flipA[i + 1] ^= 1;
            flip ^= flipA[i];
        }
        return res;
}
    }

    
}