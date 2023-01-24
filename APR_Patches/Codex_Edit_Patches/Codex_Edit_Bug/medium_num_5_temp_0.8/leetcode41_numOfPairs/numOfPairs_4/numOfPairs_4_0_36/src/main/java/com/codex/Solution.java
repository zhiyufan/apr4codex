package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(int[] nums, int target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<Integer>();
        int target = sc.nextInt();
        while (sc.hasNextInt()) {
            inputList.add(sc.nextInt());
        }
        int[] inputArray = inputList.stream().filter(i -> i <= target).mapToInt(i -> i).toArray();
        System.out.println(numOfPairs(inputArray, target));
    }
}
}