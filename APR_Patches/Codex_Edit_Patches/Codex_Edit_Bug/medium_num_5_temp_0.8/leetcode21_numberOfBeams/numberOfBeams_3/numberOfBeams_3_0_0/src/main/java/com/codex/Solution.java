package com.codex;

import java.util.*;

public class Solution {
public class file {

	private static int numberOfBeams(String[] bank) {
		
		int numBeams = 0;

		for (int i = 0; i < bank.length; i++) {
			for (int j = i+1; j < bank.length; j++) {
				int a = Integer.parseInt(bank[i]);
				int b = Integer.parseInt(bank[j]);
				if ((a & b) == 0) {
					numBeams++;
				}
			}
		}
		return numBeams;
	}

	public static void main(String[] args) {
		String[] bank = {"10101", "11100", "11010", "00101"};
		System.out.println(numberOfBeams(bank));
	}
}
}