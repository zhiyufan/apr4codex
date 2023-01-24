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
    public static long largestNumber(long num) {

        long answer = 0;
        long[] arr = new long[10];
        while (num != 0) {
            arr[(int) num % 10]++;
            num /= 10;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    answer += i;
                    answer *= 10;
                }
            }
        }
        return answer / 10;
    }


    
}