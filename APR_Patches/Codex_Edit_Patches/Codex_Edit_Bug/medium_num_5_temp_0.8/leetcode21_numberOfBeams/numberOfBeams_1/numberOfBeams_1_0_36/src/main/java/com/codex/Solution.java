package com.codex;

import java.util.*;

public class Solution {
//It should return the number of beams that can be combined.

    public static int numberOfBeams(String[] bank) {
        
        int beams = 0, cnt = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    cnt++;
                    break;
                }
            }
            beams += Integer.bitCount(num) * cnt;
            cnt = 0;
        }
        return beams;
    }

    
}