package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4};
        int result = minDeletion(a);
        System.out.println(result);
    }

    public static int minDeletion(int[] nums) {   //solved
        int count = 0;
        int i = 0;
        while (i < nums.length - 1) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                count++;i++;}
            i++;
        }

        return count;
    }

    
}