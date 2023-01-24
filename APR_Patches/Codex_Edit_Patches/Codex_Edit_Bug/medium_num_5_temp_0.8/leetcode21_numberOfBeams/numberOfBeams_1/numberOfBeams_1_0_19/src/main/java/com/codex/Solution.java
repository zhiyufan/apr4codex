package com.codex;

import java.util.*;

public class Solution {
public static int numberOfBeams(String[] bank) {
    
    int beams = 0;
    for (int i = 0; i < bank.length; i++) {
        int num = Integer.parseInt(bank[i], 2);
        boolean found = false;
        for (int j = 0; j < bank.length; j++) {
            int tmp = Integer.parseInt(bank[j], 2);
            if (i != j && (tmp & num) == 0) {
                found = true;
                break;
            }
        }
        if (found) {
            beams += Integer.bitCount(num);
        }
    }

    return beams;
}
}