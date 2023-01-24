package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                int i = 0;
                for (; i < s1.length() && i < s2.length(); i++) {
                    if (s1.charAt(i) > s2.charAt(i)) {
                        return 1;
                    } else if (s1.charAt(i) < s2.charAt(i)) {
                        return -1;
                    }
                }
                if (i == s1.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}