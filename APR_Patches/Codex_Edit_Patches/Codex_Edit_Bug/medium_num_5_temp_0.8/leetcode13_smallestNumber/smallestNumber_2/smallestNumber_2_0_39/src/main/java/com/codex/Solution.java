package com.codex;

import java.util.*;

public class Solution {
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static long smallestNumber(long num) {
	    if (num == 0) {
	        return 0;
	    }
	    
		long n = num;
		ArrayList<Integer> nums = new ArrayList<>();
		while (n > 0) {
			nums.add((int)(n % 10));
			n = n / 10;
		}
        Collections.sort(nums);
		if (nums.get(0) == 0) {
			for (int i = 1; i < nums.size(); i++) {
				if (nums.get(i) != 0) {
					int temp = nums.get(0);
					nums.set(0, nums.get(i));
					nums.set(i, temp);
					break;
				}
			}
		}
		n = 0;
		for (int i = 0; i < nums.size(); i++) {
			n = 10 * n + nums.get(i);
		}
		return n;
	}
	
	public static void main(String[] args) {
	    
		long smallest = smallestNumber(132);
		System.out.println(smallest);
		
		smallest = smallestNumber(191803771);
		System.out.println(smallest);
		
		smallest = smallestNumber(9892378);
		System.out.println(smallest);
		
		smallest = smallestNumber(0);
		System.out.println(smallest);
		
		smallest = smallestNumber(99124);
		System.out.println(smallest);
		
	}
}

    
}