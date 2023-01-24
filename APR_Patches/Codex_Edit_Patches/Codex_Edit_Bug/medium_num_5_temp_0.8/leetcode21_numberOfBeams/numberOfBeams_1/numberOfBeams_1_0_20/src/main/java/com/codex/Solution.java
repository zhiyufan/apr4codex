package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            boolean flag = true;
            for (int j = i + 1; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if ((tmp & num) != 0) {
                    flag = false;
                    break;;
                }
            }
            if (flag) {
                beams += Integer.bitCount(num);
            }
        }
        return beams;
    }

    
}