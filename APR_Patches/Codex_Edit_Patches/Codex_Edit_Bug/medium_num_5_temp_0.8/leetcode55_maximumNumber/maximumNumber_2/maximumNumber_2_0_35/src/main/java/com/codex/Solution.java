package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
		
		int cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
			cnt += change[digit];
        }
		if (cnt == 0) {
			sb.setCharAt(0, '9');
		}
        return sb.toString();
    }

    
}