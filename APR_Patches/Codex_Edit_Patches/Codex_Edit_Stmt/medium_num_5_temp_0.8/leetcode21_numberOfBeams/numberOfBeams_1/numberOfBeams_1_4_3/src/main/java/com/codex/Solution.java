package com.codex;

import java.util.*;

public class Solution {
 public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        int[][] arr = new int[bank.length][bank[0].length()];
        for (int i = 0; i < bank.length; i++) {
            
            for (int s = 0; s < bank[i].length(); s++) {
                if (bank[i].charAt(s) == '0') {
                    arr[i][s] = 0;
                } else {
                    arr[i][s] = 1;
                }
            }
        }

        for (int i = 0; i < bank.length; i++) {
            int num = 0;
            for (int s = bank[i].length() - 1; s >= 0; s--) {
                num = num * 10 + arr[i][s];
            }
            
            if (Integer.bitCount(num) == 1) {
                beams += 1;
                // System.out.println(num);
                continue;
            }
            int bit = 1;
            for (int j = 0; j < bank.length; j++) {
                int tmp = 0;
                for (int s = bank[j].length() - 1; s >= 0; s--) {
                    tmp = tmp * 10 + arr[j][s];
                }
                if (i != j && (tmp & num) == 0) {
                    // System.out.println(tmp + " " + num);
                    bit = 0;
                    break;
                }
            }
            beams += bit;
        }

        return beams;
    }
}