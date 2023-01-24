package com.codex;

import java.util.*;

public class Solution {
	int min = 1;
	int max = 6;
	double mean = 0;
	int sum = 0;
	for (int i = 0; i < rolls.length; i++) {
		sum += rolls[i];
	}
	mean = (double) sum / rolls.length;

	double sumOfSquares = 0;
	for (int i = 0; i < rolls.length; i++) {
		sumOfSquares += Math.pow(rolls[i] - mean, 2);
	}
	double stDeviation = Math.sqrt(sumOfSquares) / rolls.length;

	if (Math.abs(mean - (min + max) / 2) > stDeviation) {
		return new int[0];
	}

	int numberOfRolls = (int) Math.round((mean * rolls.length - sum) / ((min + max) / 2 - mean));

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] missingRolls = new int[numberOfRolls];

        int next = (int) ((min + max) / 2 - mean);

        for (int i = numberOfRolls - 1; i >= 0; i--) {
            missingRolls[i] = next;
        }
    }

        int next = mean / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }
}