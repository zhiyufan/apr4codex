package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {

        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }

    public long getNumber(int[] number) {
        long result = 0;
        for (int i = 0; i < number.length; ++i)
            result = result * 10 + number[i];
        return result;
    }

    public int[] find(int[] number, int step) {
        int[] result = new int[number.length];
        int[] buffer = new int[number.length];
        while (step-- > 0) {
            buffer[0] = number[0];
            result[0] = number[number.length - 1];
            for (int i = 1; i < number.length; ++i) {
                buffer[i] = (buffer[i - 1] + number[i]) % 10;
                result[i] = buffer[i];
            }
            number = result;
        }
        return result;
    }
}