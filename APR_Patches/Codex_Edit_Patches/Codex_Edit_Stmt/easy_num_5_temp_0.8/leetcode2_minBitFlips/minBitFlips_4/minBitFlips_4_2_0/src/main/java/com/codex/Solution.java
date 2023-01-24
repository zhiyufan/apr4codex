package com.codex;

import java.util.*;

public class Solution {
    public int findComplement(int num) {
        int todo = num;
        int bit = 1;
        while (todo != 0) {
            // Flip current bit
            num = num ^ bit;
            // Prepare for the next run
            bit = bit << 1;
            todo = todo >> 1;
        }
        
        return num;
    }

    
}