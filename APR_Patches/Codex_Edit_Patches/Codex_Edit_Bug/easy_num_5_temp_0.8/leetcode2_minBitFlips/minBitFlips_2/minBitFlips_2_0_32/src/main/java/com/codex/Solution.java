package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int cnt = 1;
		int x = 1, y = 2;
		int s = 1, g = 0;
		int S = start, G = goal, tmp = 0;
		int i = 0;
		while (x <= y) {
			if ((S & x) != 0) {
				s |= x;
				S &= ~x;
			}
			if ((G & x) != 0) {
				g |= x;
				G &= ~x;
			}
			cnt++;
			x <<= 1;
		}
		i = y;
		x = y;
		y <<= 1;
		while (x <= y) {
			tmp = y - i;
			if (tmp > S) {
				tmp = S;
			}
			if (tmp > G) {
				tmp = G;
			}
			if (tmp == 0) {
				break;
			}
			if ((S & tmp) != 0) {
				s |= x;
				S &= ~tmp;
			}
			if ((G & tmp) != 0) {
				g |= x;
				G &= ~tmp;
			}
			cnt++;
			x <<= 1;
		}
		// System.out.println("s = " + s + ", g = " + g + ", S = " + S +
		// ", G = " + G + ", cnt = " + cnt);
		while (S != 0 || G != 0) {
			x = 1;
			while (x <= y) {
				tmp = y - i;
				if (tmp > S) {
					tmp = S;
				}
				if (tmp > G) {
					tmp = G;
				}
				if (tmp == 0) {
					break;
				}
				if ((S & tmp) != 0) {
					s |= x;
					S &= ~tmp;
				}
				if ((G & tmp) != 0) {
					g |= x;
					G &= ~tmp;
				}
				cnt++;
				x <<= 1;
            }
		}
		// System.out.println("s = " + s + ", g = " + g + ", S = " + S +
		// ", G = " + G + ", cnt = " + cnt);
		return ((s ^ g) == 0) ? cnt : -1;
}
}