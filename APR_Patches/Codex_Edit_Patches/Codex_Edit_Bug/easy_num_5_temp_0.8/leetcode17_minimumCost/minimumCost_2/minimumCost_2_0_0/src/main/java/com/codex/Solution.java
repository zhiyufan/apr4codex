package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		Arrays.sort(cost);
		int sum = 0;
		int temp = -1;
		for (int i = 0; i < cost.length; i++) {
			if (i % 3 == 2) {
				continue;
			}
			sum += cost[i];
			temp = i;
		}
		if (temp % 3 != 2) {
			sum += cost[cost.length - 1];
		}
		System.out.println(sum);
	}
}

    
}