package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static long smallestNumber(long num) {
        List<Long> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;                
        }
        list.sort(Integer::compareTo);
        long answer = 0L;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(list.size() - 1 - i) * Math.pow(10, i);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(smallestNumber(261235)); // "12356"
        System.out.println(smallestNumber(209917)); // "0"
        System.out.println(smallestNumber(285365)); // "234568"
        System.out.println(smallestNumber(269045)); // "26945"
        System.out.println(smallestNumber(296837)); // "239678"
    }
}


    
}