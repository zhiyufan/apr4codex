package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            int digit = (int) num % 10;
            if (digit == 0) {
                list.add(digit);
            } else if (digit % 2 == 0) {
                list.add(0, digit);
            } else {
                list.add(digit);
            }
            num /= 10;
        }
        list.sort(Integer::compareTo);
        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }

    
}