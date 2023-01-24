package com.codex;

import java.util.*;

public class Solution {
package main;

public class minMoves {

	public static void main(String[] args) {
		System.out.println(minMoves(1,1));
		System.out.println(minMoves(2,1));
		System.out.println(minMoves(10,2));
		System.out.println(minMoves(3,1));
		System.out.println(minMoves(9999,10));
		System.out.println(minMoves(11,7));
	}
	public static int minMoves(int target, int maxDoubles) {
		

        int moves = 0;
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }

}
}