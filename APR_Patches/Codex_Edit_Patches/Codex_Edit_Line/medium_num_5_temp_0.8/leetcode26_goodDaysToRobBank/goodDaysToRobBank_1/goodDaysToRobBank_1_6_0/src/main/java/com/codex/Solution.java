package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int[] security = new Random().ints(200, 0, 1000).toArray();

        List<Integer> goodDays = goodDaysToRobBank(security, 10);
        System.out.printf("There are %d good days to rob a bank!%n", goodDays.size());
        goodDays.forEach(System.out::println);
    }

    public static List<Integer> goodDaysToRobBank(int[] security, int time) 
{
        
        List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            boolean good = false;
            for (int j = i - time; j < i; j++) {
                if (security[j] > security[j + 1]) {
                    good = true;
                    break;
                }
            }
            if (good) continue;
            for (int j = i + 1; j < i + time + 1; j++) {
                if (security[j - 1] > security[j]) {
                    good = true;
                    break;
                }
            }
            if (!good) goodDays.add(i);
        }
        return goodDays;
    }

}    
}