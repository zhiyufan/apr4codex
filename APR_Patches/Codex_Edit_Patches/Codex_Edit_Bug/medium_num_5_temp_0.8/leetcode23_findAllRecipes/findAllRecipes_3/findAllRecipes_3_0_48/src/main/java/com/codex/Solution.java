package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {

        List<String> res = new ArrayList<>();
        int[] arr = {2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
        for (int l : arr){
            System.out.println(l);
        } 
    }
    
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return res;
    }

    
}