package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
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
        return beams;
    }

    public static void main(String[] args) {
        String[] bank = {"00000000000001", "11110110010000", "01001001000111"};
        int n = numberOfBeams(bank);
        System.out.println(n);
    }
}
    
}