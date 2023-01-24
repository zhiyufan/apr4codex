package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {

        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = 0;
            for (int k = 0; k < bank[i].length(); k++) {
                num = num * 2 + bank[i].charAt(k) - '0';
            }

            for (int j = 0; j < bank.length; j++) {
                int tmp = 0;
                for (int k = 0; k < bank[j].length(); k++) {
                    tmp = tmp * 2 + bank[j].charAt(k) - '0';
                }

                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }
}