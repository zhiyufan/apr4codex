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
        if (list.get(list.size() - 1) == 0) {
            int i = list.size() - 1;
            while (list.get(i) == 0 && i >= 0) {
                i--;
            }
            i++;
            list.remove(i);
            for (int j = list.size() - 1; j >= 0; j--) {
                answer += list.get(j) * Math.pow(10, j);
            }
        }
        return answer;
    }
}