package com.codex;

import java.util.*;

public class Solution {
public class Solution {

  public static int minimumSum(int num) {
    if (num < 10) {
      return num;
    }

    int minSum = Integer.MAX_VALUE;
    String numStr = String.valueOf(num);
    for (int i = 1; i < numStr.length(); i++) {
      int num1 = Integer.valueOf(numStr.substring(0, i));
      int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
      minSum = Math.min(minSum, num1 + num2);
    }
    return minSum;
  }

  public static void main(String[] args) {
    System.out.println("minSum(" + 132 + "): " + minimumSum(132));
    System.out.println("minSum(" + 56 + "): " + minimumSum(56));
    System.out.println("minSum(" + 15 + "): " + minimumSum(15));
    System.out.println("minSum(" + 1 + "): " + minimumSum(1));
    System.out.println("minSum(" + 23 + "): " + minimumSum(23));
    System.out.println("minSum(" + 0 + "): " + minimumSum(0));
    System.out.println("minSum(" + 1324 + "): " + minimumSum(1324));
  }
}
}