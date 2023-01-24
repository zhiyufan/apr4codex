package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        while (num != 0) {
            list.add((int) num % 10);
            if (list.get(list.size() - 1) == 0)
                flag = true;
            num /= 10;
        }
        if (flag)
            list.remove(list.size() - 1);
            
        list.sort(Integer::compareTo);
        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }
}