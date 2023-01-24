package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Test {

	public static int minimumCost(int[] cost) {
		
		Arrays.sort(cost);
		int sum = 0;
		for (int i = 0; i < cost.length; i++) {
			if (i % 3 == 2) {
				continue;
			}
			sum += cost[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		int number = input.nextInt();  
		int cost[] = new int[number];
		
		System.out.println();	
		System.out.print("Please enter the elements in the array: ");
		for (int i = 0; i < cost.length; i++) {
			cost[i] = input.nextInt();
		}
		
		int minimumCost = minimumCost(cost);
		System.out.println();	
		System.out.print("The minimum sum of buying a set of 3 flowers such that no two flowers in the set have a 			common color is: " + minimumCost);

	}
}

    
}