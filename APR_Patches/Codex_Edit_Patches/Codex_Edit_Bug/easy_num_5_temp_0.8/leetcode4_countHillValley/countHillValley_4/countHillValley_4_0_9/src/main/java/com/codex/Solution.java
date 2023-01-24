package com.codex;

import java.util.*;

public class Solution {
package one;

import java.util.Scanner;

public class file {
	
	
	
	public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1] ) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1] ) {
                count++;
            }
        }
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int nums[]=new int[n];
        return count;
    }


    
    
}