package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       int[] res = missingRolls(new int[]{6, 6, 4, 2}, 5, 2);

      for (int i = 0; i < res.length; i++) {
          System.out.print(res[i] + ", ");
      }
    }

    public static int[] missingRolls(int[] rolls, int mean, int total) {

        List<Integer> results = new ArrayList<>();
        if(total == 0) return new int[0];
        if (rolls.length == 0) {
            for (int i = 0; i < total; i++) {
                results.add(mean);
            }
            return results.stream().mapToInt(i -> i).toArray();
        }
        
        int expectedSum = total * mean + rolls.length * mean;
        int actualSum = 0;
        for (int val : rolls) {
            actualSum += val;
        }
        int sum = expectedSum - actualSum;

        if (sum % total != 0) {
            return new int[0];
        }

        int avg = sum / total;

        if (avg > 6 || avg < 1) {
            return new int[0];
        }

        for (int i = 0; i < total; i++) {
            results.add(avg);
        }

        for (int i = 0; i < results.size(); i++) {
            int cur = results.get(i);
            if (cur < 6) {
                results.set(i, cur + 1);
                if (sumOne(results) != expectedSum) {
                    results.set(i, cur);
                }
            }
            if (cur > 1) {
                results.set(i, cur - 1);
                if (sumOne(results) != expectedSum) {
                    results.set(i, cur);
                }
            }
        }
        if (sumOne(results) == expectedSum) {
            return results.stream().mapToInt(i -> i).toArray();
        }
        return new int[0];
    }

    public static int sumOne(List<Integer> results) {
        int sum = 0;
        for (int j : results) {
            sum += j;
        }
        return sum;
    }
}
}