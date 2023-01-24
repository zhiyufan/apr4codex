package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(findEvenNumbers(array)));
    }

    public static Integer[] findEvenNumbers(int[] digits) {
        
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    }
                }
            }
        }
        Integer[] result = evenNumbers.toArray(new Integer[evenNumbers.size()]);
        Arrays.sort(result, (a, b) -> Integer.compare(a, b));
        return result;
    }

}
}