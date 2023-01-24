package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int minOperations(int[][] grid, int x) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max - min == 0) {
            return 0;
        }
        if (max - min < x) {
            return -1;
        }
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < target) {
                    result += (target - grid[i][j]) / x;
                }
            }
        }
        return result;
    }



   //Find whether the number is present in the array or not.
   
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
		    arr[i] = sc.nextInt();
		}
		int num  = sc.nextInt();
		Arrays.sort(arr);
		if(Arrays.binarySearch(arr, num) >= 0){
		    System.out.println("It is present in the array");
		}else{
		    System.out.println("Not present in the array");
		}
	}

    
    
}