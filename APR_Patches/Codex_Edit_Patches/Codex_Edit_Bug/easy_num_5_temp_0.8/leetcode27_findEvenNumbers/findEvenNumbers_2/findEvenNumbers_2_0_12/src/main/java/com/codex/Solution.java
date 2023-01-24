package com.codex;

import java.util.*;

public class Solution {
    

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Мое решение
 */
public class Program {
    public static int[] findEvenNumbers(int[] digits) {

        List<Integer> result = new ArrayList<>();
        IntStream.range(0, digits.length).forEach(i -> {
            IntStream.range(i + 1, digits.length).forEach(j -> {
                IntStream.range(j + 1, digits.length).forEach(k -> {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) result.add(num);
                });
            });
        });

        System.out.println(result);

        return result.stream().mapToInt(x -> x).toArray();
    }

    /**
     * Решение из курсов
     */
    public static int[] findEvenNumbers1(int[] digits) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) list.add(num);
                }
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}