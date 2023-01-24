package com.codex;

import java.util.*;

public class Solution {
    public void reverseString(char[] s) {
        int i = 0, j= s.length -1;
        char tmp;
        while (i < j) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    
}