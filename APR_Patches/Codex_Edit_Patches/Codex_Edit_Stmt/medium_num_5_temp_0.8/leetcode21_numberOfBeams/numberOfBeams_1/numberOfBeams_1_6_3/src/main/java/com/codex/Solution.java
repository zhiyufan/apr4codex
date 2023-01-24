package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        int[] subnets = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            subnets[i] = Integer.parseInt(bank[i], 2);
        }
        int beams = 0;
        for (int i = 0; i < subnets.length; i++) {
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }

    
}