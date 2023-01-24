package com.codex;

import java.util.*;

public class Solution {
public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> evenNumbers = new HashSet<>();
        for (int a : digits) {
            for (int b : digits) {
                for (int c : digits)
                    if (a != b && b != c)
                        if ((a * 100 + b * 10 + c) % 2 == 0)
                            evenNumbers.add(a * 100 + b * 10 + c);
            }
        }
        int[] res = evenNumbers.stream().mapToInt(i -> i).sorted().toArray();
        return res;
    }
}