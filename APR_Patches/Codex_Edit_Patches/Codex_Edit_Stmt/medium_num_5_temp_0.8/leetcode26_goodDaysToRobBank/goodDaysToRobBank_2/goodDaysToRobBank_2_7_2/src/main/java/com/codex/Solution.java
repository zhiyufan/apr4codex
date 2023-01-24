package com.codex;

import java.util.*;

public class Solution {
public class Main {


    public static void main(String[] args) {
        int[] security = {2, 3, 6, 5, 9, 4, 6, 5, 9, 10, 11, 12};
        int time = 5;

        List<Integer> goodDays = goodDaysToRobBank(security, time);
        for (Integer day : goodDays) {
            System.out.println(day);
        }

    }
    
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
    
        List<Integer> goodDays = new ArrayList<>();
        
        for (int i = 0; i < security.length; i++) {
            int[] subArr = Arrays.copyOfRange(security, i, i + time);
            
            if (isNonDecreasing(subArr)) {
                goodDays.add(i);
            }
        }
        
        return goodDays;
    }

    private static boolean isNonDecreasing(int[] arr) {
        boolean nonDecreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                nonDecreasing = false;
                break;
            }
        }
        return nonDecreasing;
    }
}
}