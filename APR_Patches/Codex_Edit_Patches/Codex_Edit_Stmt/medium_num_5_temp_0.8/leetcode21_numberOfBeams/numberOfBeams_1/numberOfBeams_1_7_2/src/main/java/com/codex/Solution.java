package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for (String numb : bank) {
            int num = Integer.parseInt(numb, 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if ((tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }

    
}