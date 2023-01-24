package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

	
	public static int numOfPairs(String[] nums, String target) {
		int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                    }
                }
            }
        }
        return count/2 ;
	}
	
	// DO NOT MODIFY CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		String target = scanner.next();
		String[] nums = new String[length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.next();
		}
		
		System.out.println(numOfPairs(nums, target));
	}
}


    
}