package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
 
public class Test {
 
  public static void main(String[] args) {
    int[] rolls = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[] newRolls = Arrays.copyOfRange(rolls, rolls.length / 2, rolls.length);
    int mean = 7;
    int n = 7;
  
    // calculate missing rolls
    int[] missingRolls = missingRolls(newRolls, mean, n);
    for (int i = 0; i < missingRolls.length; i++) {
      System.out.println(missingRolls[i]);
    }
  
  }
 
  public static int[] missingRolls(int[] rolls, int mean, int n) {
 
    int[] res = new int[n];
    int sum = mean * (n + rolls.length);
    for (int roll : rolls) {
      sum -= roll;
    }
    for (int i = 0; i < n; i++) {
      if (sum % n == 0) {
        int avg = sum / n;
        if (avg > 0 && avg <= 6) {
          res[i] = avg;
          sum -= avg;
        } else {
          return new int[0];
        }
      } else {
        return new int[0];
      }
    }
    return res;
  }
 
}
}