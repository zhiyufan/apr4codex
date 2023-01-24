package com.codex;

import java.util.*;

public class Solution {
public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        
        int[] ar = new int[bank.length];
        for(int i = 0; i < bank.length; i++) {
            ar[i] = Integer.parseInt(bank[i], 2);
        }
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i != j && (ar[i] & ar[j]) == 0) {
                    beams += Long.bitCount(ar[i]);
                    break;
                }
            }
        }
        return beams;
    }
}