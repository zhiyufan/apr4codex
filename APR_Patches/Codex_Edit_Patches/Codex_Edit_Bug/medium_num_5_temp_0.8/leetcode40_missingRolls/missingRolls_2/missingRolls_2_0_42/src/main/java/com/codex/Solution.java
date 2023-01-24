package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        int[] rolls = { 1, 2, 3, 4, 7, 8, 9, 10 };
        int mean = 6;
        int n = 2;
        System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n)
    {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < rolls.length; i++)
        {
            if(rolls[i] > max)
                max = rolls[i];
            if(rolls[i] < min)
                min = rolls[i];
            sum += rolls[i];
        }

        if(mean < 1 || mean > 6 || sum > (mean * (rolls.length + n)))
            return new int[0]; // no such combination
        int[] res = new int[n];
        if(sum == mean * rolls.length) { // all rolls are the same, not a single roll is missing
            for(int i = 0; i < n; i++)
                res[i] = mean;
            return res;
        }

        int remainingSum = mean * (rolls.length + n) - sum;
        if(remainingSum > (6 - max) * n)
            return new int[0]; // no such combination
        int remaining = remainingSum;
        int i = 0;
        while(remaining > 0) {
            if(n - 1 == i && rolls.length + i > 1 && rolls[rolls.length + i - 2] - rolls[rolls.length + i - 1] == 1) { // we can't add one more number between the last two numbers
                remaining += rolls[rolls.length + i - 1];
                i--;
            } else {
                if(remaining > 6 - max) {
                    res[i] = max + 1;
                    remaining -= 6 - max;
                    max++;
                    i++;
                } else {
                    res[i] = max + remaining;
                    remaining = 0;
                    i++;
                }
            }
        }

    }

}
}