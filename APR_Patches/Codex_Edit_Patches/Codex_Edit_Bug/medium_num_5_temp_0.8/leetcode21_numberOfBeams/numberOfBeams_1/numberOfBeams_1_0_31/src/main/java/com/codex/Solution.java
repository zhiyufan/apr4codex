package com.codex;

import java.util.*;

public class Solution {
public static int numberOfBeams(String[] bank) {
	int length = bank.length;
	int c = 0;
	int end = (1 << length) - 1;
	int[] flags = new int[length];
	for (int i = 0; i < length; i++) {
		flags[i] = 1 << i;
    }

	for (int state = end; state > 0; state--) {
		int d = 0;
		int index = 0;
		for (int i = 0; i < length; i++) {
			if ((flags[i] & state) != 0) {
				d |= Integer.parseInt(bank[i], 2);
				index = i;
			}
		}
		if (d == (d | Integer.parseInt(bank[index], 2))) {
			c++;
		}
	}
	return c;
}
}