package com.codex;

import java.util.*;

public class Solution {
	
    public static int numberOfBeams(String[] bank) {
        int totalBeams = 0, beams;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            beams = 0;
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(tmp);
                }
            }
            totalBeams += beams;
        }
        return totalBeams;
    }
}