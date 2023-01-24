package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {15,11,10,9,8,7,6};
        Arrays.sort(nums);
        long result = minimalKSum(nums,5);
        System.out.println(result);
    }

    public static long minimalKSum(int[] nums, int k) {


        long result = 0L;
        int j = 0;
        for(int i = 0; i < nums.length && j < k; i++){
            if(j+1 >= nums[i])
                result += nums[i];
            else
                result += j+1;
            j++;
        }

        while(j < k){
            result += j + 1;
            j++;
        }

        return result;
    }

}
    
    
}