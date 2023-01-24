package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        long answer;
        if (num < 10) {
            return num;
        }
        
        List<Integer> list = new ArrayList<>();
        
        if (num / 10 == 0) {
            return sortedList (list, 10);
        }

        while (num != 0) {
            list.add((int) num % 10);
            num /= 10;
            
        }
        if (list.size() == 2) {
            return sortedList (list, 100);
        }
        if (list.size() == 3) {
            return sortedList (list, 1000);
        }
        if (list.size() == 4) {
            return sortedList (list, 10000);
        }
        if (list.size() == 5) {
            return sortedList (list, 100000);
        }
        if (list.size() == 6) {
            return sortedList (list, 1000000);
        }
        
        return 0;
    }
    
    private static long sortedList (List<Integer> list, long st) {
        long answer = 0;
        
        list.sort(Integer::compareTo);
        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * st / Math.pow(10, i);
        }

        return answer;
    }

    
}