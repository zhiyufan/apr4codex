package com.codex;

import java.util.*;

public class Solution {
public int lastRemaining(int n) {
        if (n <= 2) return n;
        int res = 2 * (1 + (n / 2 - 1) / 2);
        return res;
    }
    
    public int lastRemaining(int n) {
        boolean left = true;
        int remaining = n;
        int step = 1;
        int head = 1;
        while (remaining > 1) {
            if (left || remaining % 2 ==1) {
                head = head + step;
            }
            remaining = remaining / 2;
            step = step * 2;
            left = !left;
        }
        return head;
    }
}