package com.codex;

import java.util.*;

public class Solution {
public class Main {
  public static void main(String[] args) {
    
    int[] numbers = { 2, 5, 9, 0, 2, 1, 8, 5, 4 };
    int target = 2;
    int[] result = targetRange(numbers, target);
    for (int num : result) {
      System.out.println(num);
    }

  }
  
  public static int[] targetRange(int[] numbers, int target) {
    int[] arr = { -1, -1 };
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == target) {
        if (arr[0] == -1) {
          arr[0] = i;
        } else {
          arr[1] = i;
        }
      }
    }
    return arr;
  }
}
}