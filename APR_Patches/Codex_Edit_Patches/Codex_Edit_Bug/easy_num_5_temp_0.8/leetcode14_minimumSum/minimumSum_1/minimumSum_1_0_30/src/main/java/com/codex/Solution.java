package com.codex;

import java.util.*;

public class Solution {
    class Solution {
    public int minimumSum(int num) {
        

        int min = num;
        while (num > 0) {            
            int sum = 0;
            List<Integer> digits = new ArrayList<>();
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            Collections.sort(digits);
            int first = 0, second = 0;
            for (int i = digits.size() - 1; i >= 0; i--) {
                first = first * 10 + digits.get(i);
                if (i > 0)
                    second = second * 10 + digits.get(i - 1);
                i--;
            }
            sum+=first + second;
            min = min > sum ? sum : min;
            num--;
        }
        return min;
    }
    }

    
}