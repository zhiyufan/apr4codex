package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
		if (target == 1) {
			return 1;
		}
		if (target % 2 == 0) {
			return minMoves(target / 2, maxDoubles) + 1;
		} else if (target % 2 == 1 && target > 1) {
			return minMoves(target - 1, maxDoubles) + 1;
		}
		return -1;
	}
}