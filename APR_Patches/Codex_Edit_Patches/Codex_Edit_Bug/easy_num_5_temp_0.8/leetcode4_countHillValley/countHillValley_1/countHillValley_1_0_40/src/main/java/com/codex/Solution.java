package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.io.*;

 
class Main {
    
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String line = scan.nextLine();  
            String[] tokens = line.split(" ");
            int[] nums = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++)
                nums[i] = Integer.parseInt(tokens[i]);
            System.out.println(countHillValley(nums));
        }
    }
}


/*
The original solution:

    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    } 

*/
}