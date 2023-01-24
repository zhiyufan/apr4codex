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
    for (int i = list.size() - 1, j = 0; i >= 0 ; i--, j++) {
        answer += list.get(i) * Math.pow(10, j);
    }
    return answer;
}
}