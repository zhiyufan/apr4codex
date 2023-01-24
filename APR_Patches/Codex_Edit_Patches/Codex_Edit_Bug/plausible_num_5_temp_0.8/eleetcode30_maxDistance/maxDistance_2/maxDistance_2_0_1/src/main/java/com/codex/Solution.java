package com.codex;

import java.util.*;

public class Solution {
package com.test.test;

public class MaxDistance {

	public static void main(String[] args) {
		int[] colors = { 2, 1, 3, 3, 2, 1, 1, 3, 2, 1, 2, 1, 1, 3, 2, 1, 2, 1, 1, 3, 2, 1, 2, 1, 1, 3, 2, 1, 2, 1, 1, 3, 2,
				1, 2, 1, 1, 3, 2, 1, 2, 1, 1, 3 };
		int[] colors1 = {2, 3, 1, 3, 2, 1, 2, 4, 4, 5, 7};

		System.out.println(maxDistance(colors1));
	}

	public static int maxDistance(int[] colors) {

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

}
}