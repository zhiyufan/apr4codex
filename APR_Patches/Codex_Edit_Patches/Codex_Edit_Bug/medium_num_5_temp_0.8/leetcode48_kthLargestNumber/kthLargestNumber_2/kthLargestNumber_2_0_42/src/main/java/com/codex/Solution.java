package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    	public boolean winningMove(int[][] board, int turn) {
		int boardSize = board.length;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int i = 0;
		int j = 0;
		int diagSum = 0;
		int antiDiagSum = 0;
		for (i = 0; i < boardSize; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (j = 0; j < boardSize; j++) {
				rowSum += board[i][j];
				colSum += board[j][i];
			}
			if (rowSum == 0) {
				set1.add(i);
			}
			if (colSum == 0) {
				set2.add(i);
			}
			diagSum += board[i][i];
			antiDiagSum += board[boardSize - 1 - i][i];
		}
		if (diagSum == 0) {
			set1.add(i);
		}
		if (antiDiagSum == 0) {
			set2.add(i);
		}
		if (set1.size() > 0 || set2.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean checkWin(int[][] board, int turn) {
		int boardSize = board.length;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int i = 0;
		int j = 0;
		int diagSum = 0;
		int antiDiagSum = 0;
		for (i = 0; i < boardSize; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (j = 0; j < boardSize; j++) {
				rowSum += board[i][j];
				colSum += board[j][i];
			}
			if (rowSum == 3 * turn) {
				set1.add(i);
			}
			if (colSum == 3 * turn) {
				set2.add(i);
			}
			diagSum += board[i][i];
			antiDiagSum += board[boardSize - 1 - i][i];
		}
		if (diagSum == 3 * turn) {
			set1.add(i);
		}
		if (antiDiagSum == 3 * turn) {
			set2.add(i);
		}
		if (set1.size() > 0 || set2.size() > 0) {
			return true;
		}
		return false;
	}
}