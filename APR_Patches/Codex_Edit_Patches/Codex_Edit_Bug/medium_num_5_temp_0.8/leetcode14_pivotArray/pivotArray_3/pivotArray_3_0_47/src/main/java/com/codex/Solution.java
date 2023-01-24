package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        for(int i = 0; i <= two; i++){
            while (nums[i] == 2 && i < two) swap(nums, i, two--);
            while (nums[i] == 0 && i > zero) swap(nums, i, zero++);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
}