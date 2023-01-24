package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (int j = i + 1; j < bank.length; j++) {
                int num = Integer.parseInt(bank[i], 2);
                int tmp = Integer.parseInt(bank[j], 2);
                if ((tmp & num) == 0) {
                    count++;
                }
            }
            beams += Math.max(count, beams);
        }
        return beams;
    }

    
}