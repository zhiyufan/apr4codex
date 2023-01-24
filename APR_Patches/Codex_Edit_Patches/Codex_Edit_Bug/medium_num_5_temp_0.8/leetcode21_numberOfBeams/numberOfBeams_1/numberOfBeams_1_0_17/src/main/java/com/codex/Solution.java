package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
		int m = 0;
        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
		
		for (int i = 0; i < bank.length; i++) {
			if (Integer.bitCount(Integer.parseInt(bank[i], 2)) > m) {
				m = Integer.bitCount(Integer.parseInt(bank[i], 2));
			}
		}
		return m == 0 ? beams : beams + m;
    }

    
}