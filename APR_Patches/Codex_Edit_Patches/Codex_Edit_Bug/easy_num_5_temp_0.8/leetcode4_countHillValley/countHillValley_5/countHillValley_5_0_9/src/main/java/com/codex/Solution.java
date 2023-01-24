package com.codex;

import java.util.*;

public class Solution {
	/*

		Name: Harshal Bhimrao Bodhare
		C.S. 1428.901
		Lab Section: L01
		I did not collaborate with anyone on this assignment.

	*/


	/*

		This program is used to count the number of peaks in an array

	*/


	import java.util.Scanner;

	public class Lab08_C {

	   public static void main (String[] args) {

		   	Scanner kb = new Scanner(System.in);

			System.out.print("\nEnter the number of integers in the array: ");

			int size = kb.nextInt();

			int[] nums = new int[size];

			System.out.print("\nEnter the values in the array, one per line: ");


			for(int i = 0 ; i < size ; i++){
			  System.out.print("\nValue " + (i+1) + ": ");
			  nums[i] = kb.nextInt();
			}

			System.out.printf("\nThe number of hill/valleys are: %d", countHillValley(nums));
		}

    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
   }
}

    
}