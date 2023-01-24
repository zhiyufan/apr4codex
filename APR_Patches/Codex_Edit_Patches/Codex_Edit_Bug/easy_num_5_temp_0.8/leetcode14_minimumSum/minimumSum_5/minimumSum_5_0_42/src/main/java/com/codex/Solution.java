package com.codex;

import java.util.*;

public class Solution {
public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

/*
def minimum_sum(num)
    num_string = num.to_s
    min = num_string.length
    for i in 1..num_string.length-1
      new_1 = num_string[0..i]
      new_2 = num_string[i..num_string.length]
      sum = new_1.to_i + new_2.to_i
      if sum < min
        min = sum
      end
    end
    min
  end
*/  
}