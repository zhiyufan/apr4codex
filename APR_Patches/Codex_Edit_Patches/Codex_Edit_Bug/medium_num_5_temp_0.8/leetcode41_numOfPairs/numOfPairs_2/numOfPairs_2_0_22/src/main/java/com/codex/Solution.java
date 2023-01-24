package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int numbers = input.nextInt();
        //int[] num = new int[numbers];
        String target = input.nextLine();
        String num1 = input.nextLine();
        String[] num = num1.split(" ");
        
        System.out.println(numOfPairs(num, target));

    }

    public static int numOfPairs(String[] nums, String target) {
        int length = nums.length;
        int j = 1;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            for (j = 1; j < length; j++) {
                if (nums[i].equals(nums[j])) {
                    nums[i] = "0";
                    nums[j] = "0";
                    count++;
                } 
            }
        }

        return count;
    }

}
}