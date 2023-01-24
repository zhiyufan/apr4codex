package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    
    /*
    * @param : An integer
    * @param : An integer
    * @return: An integer denote the count of digit k in 1..n
    */

    public int digitCounts(int k, int n) {
        int count = 0;

        if (k == 0) count++;

        for (int i = 0; i <= n; i++) {
            int current = i;
            while (current != 0) {
                if (current % 10 == k) count++;
                current /= 10;
            }
        }
        return count;

    }
};

    
    
}