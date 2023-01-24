package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {
        
    List<Integer> list = new ArrayList<>();
    while (num != 0) {
        list.add((int) num % 10);
        num /= 10;
    }
    list.sort(Integer::compareTo);
    long answer = 0;
    for (int i = 0; i < list.size(); i++) {
        answer += list.get(i) * Math.pow(10, i);
    }
    return answer;
}

    //////version 2
        public static long smallestNumber(long num) {
        	final int[] digits = new int[10];
        	while (num > 0) {
        		int digit = (int)(num % 10);
        		digits[digit]++;
        		num /= 10;
        	}

        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < digits.length; i++) {
        		for (int j = 0; j < digits[i]; j++) {
        			sb.append(String.valueOf(i));
        		}
        	}
        	return Long.valueOf(sb.toString());
        }

    
}