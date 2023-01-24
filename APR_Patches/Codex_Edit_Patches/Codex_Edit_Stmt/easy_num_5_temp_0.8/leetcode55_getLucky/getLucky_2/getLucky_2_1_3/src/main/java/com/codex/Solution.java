package com.codex;

import java.util.*;

public class Solution {
public void reverse(char[] s, int l, int r) {
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
        while (k > 0) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            number = sum;
            k--;
        }
        return number;
    }

    
}