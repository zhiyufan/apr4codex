package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;
    
    public class Main {
    	public static void main(String[] args) {
    		Scanner scn = new Scanner(System.in);
    		int n = scn.nextInt();
    		int[] a = new int[n];
    		for (int i = 0; i < n; i++) {
    			a[i] = scn.nextInt();
    		}
    		int p = scn.nextInt();
    		a = pivotArray(a, p);
    		for (int i = 0; i < n; i++) {
    			System.out.print(a[i] + " ");
    		}
    	}
    
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
        }
        return nums;
    }   
}

    
}