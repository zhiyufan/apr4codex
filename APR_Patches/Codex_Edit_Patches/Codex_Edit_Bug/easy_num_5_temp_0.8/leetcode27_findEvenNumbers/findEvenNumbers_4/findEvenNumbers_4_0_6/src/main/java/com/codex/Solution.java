package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindEven {
    public static int[] findNumbers(int[] digits) {
        int resultSize = (int) Math.pow(digits.length, 3);
        Set<Integer> result = new HashSet<>();
        for (int digit : digits) {
            resultSize /= digits.length;
            int[] partialResult = new int[resultSize];
            Arrays.fill(partialResult, digit);
            if (result.isEmpty()) {
                result.addAll(Arrays.asList(partialResult));
            } else {
                HashSet<Integer> toAdd = new HashSet<>();
                for (int num : result) {
                    for (int i : partialResult) {
                        toAdd.add(num * 10 + i);
                    }
                }
            }
            result.addAll(toAdd);
        }
        return result.stream().filter(x -> x % 2 == 0).mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println(Arrays.toString(findNumbers(input)));
    }
}
}