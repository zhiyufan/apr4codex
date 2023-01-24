package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
		String S = Integer.toBinaryString(start);
		String G = Integer.toBinaryString(goal);
		if (S.length() > G.length()) {
			return -1;
		}
		int p1 = S.length() - 1;
		int p2 = G.length() - 1;
		boolean flip = false;
		int re = 0;
		while (p1 >= 0 && p2 >= 0) {
			if (S.charAt(p1) != G.charAt(p2)) {
				if (!flip) {
					re++;
					flip = true;
				}
			} else if (flip) {
				flip = false;
			}
			p1--;
			p2--;
		}
		while (p2 >= 0) {
			if (G.charAt(p2) == '1') {
				if (!flip) {
					re++;
					flip = true;
				}
			} else if (flip) {
				flip = false;
			}
			p2--;
		}
		return p1 >= 0 ? -1 : re;
	}
}