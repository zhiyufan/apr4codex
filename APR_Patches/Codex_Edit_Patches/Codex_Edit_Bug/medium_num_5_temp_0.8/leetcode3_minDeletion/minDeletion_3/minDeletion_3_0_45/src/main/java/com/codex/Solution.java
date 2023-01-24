package com.codex;

import java.util.*;

public class Solution {
public static void main(String args[]) {

		int num = 6;
		int count = 0;

		while (num > 0) {

			num &= (num - 1);
			count++;
		}

		System.out.println(count);
		
    }
}