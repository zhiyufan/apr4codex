package com.codex;

import java.util.*;

public class Solution {
public static int[] findEvenNumbers(int[] digits) {
 
  ArrayList<Integer> result = new ArrayList<Integer>();
  // Sort the array so that the order is always the same
  Arrays.sort(digits);
 
  // run 3 loops
  for (int i = 0; i < digits.length - 2; i++) {
   for (int j = i + 1; j < digits.length - 1; j++) {
    for (int k = j + 1; k < digits.length; k++) {
     // Create 3 digit number from the chosen 3 numbers
     int num = digits[i] * 100 + digits[j] * 10 + digits[k];
     // If the number is even, add it to result
     if (num % 2 == 0) {
      result.add(num);
     }
    }
   }
  }
  // Sort the result array
  Collections.sort(result);
  return result.stream().mapToInt(Integer::intValue).toArray();
 }
}