package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
       
        String s = String.valueOf(num);
        if (s.length() == 1) {
			return num;
		}
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int i = 0;
        while (c[i] == '0') {
			i++;
        }
        return Long.parseLong(newS);
    }

    
}