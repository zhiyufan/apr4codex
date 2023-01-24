package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {
    public static int mostFrequent(int[] nums) {

        int count = 0;
        int maxCount = 0;
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                target = nums[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(mostFrequent(array));
    }
}
}