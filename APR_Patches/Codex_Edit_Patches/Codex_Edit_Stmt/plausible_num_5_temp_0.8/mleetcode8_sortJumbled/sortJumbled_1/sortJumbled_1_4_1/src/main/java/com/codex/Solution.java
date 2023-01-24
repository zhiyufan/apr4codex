package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] numbers) {
        

        int[] res = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            res[i] = numbers[i];
        }
        Arrays.sort(res);

        int[] map = new int[mapping.length];
        for (int i = 0; i < mapping.length; i++) {
            map[mapping[i]] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = map[numbers[i]];
        }

        Arrays.sort(numbers);
        return numbers;
    }

    
}