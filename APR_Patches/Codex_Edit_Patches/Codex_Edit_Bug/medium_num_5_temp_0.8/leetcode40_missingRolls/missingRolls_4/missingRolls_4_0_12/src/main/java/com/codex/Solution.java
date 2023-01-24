package com.codex;

import java.util.*;

public class Solution {
public static int[] missingRolls(int[] rolls, int mean, int n) {
	double sum = 0.0;
	int total_count = rolls.length + n;
	for (int x : rolls) sum += x;
	sum = sum / rolls.length;
	double missing = (total_count * mean - sum) / n;
	if (missing < 1 || missing > 6 || missing % 1 != 0) return new int[]{};
	else {
		int[] res = new int[n];
		Arrays.fill(res, (int)missing);
		return res;
    }

}
}