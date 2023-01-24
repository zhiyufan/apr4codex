package com.codex;

import java.util.*;

public class Solution {
package com.codekata.kata6;

import java.util.Arrays;

public class MissingRolls {

	public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        sum = (mean * (n + rolls.length)) - sum;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
	}

	public static void main(String[] args) {
		int[] rolls = {
				    1,
				    2,
				    3,
				    4,
				    5,
				    6,
				    8
				};
		System.out.println(Arrays.toString(missingRolls(rolls, 5, 3)));
	}
}
}