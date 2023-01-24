package com.codex;

import java.util.*;

public class Solution {
package com.karan.findmissingnumber;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] input = {1,2,4,5};
        int result = findMissingNumber(input);
        System.out.println("Missing Number is : " + result);
    }

    public static int findMissingNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int xor = 0;
        for(int i = 0; i <= nums.length; i++) {
            xor ^= i;
            if(i < nums.length) {
                xor ^= nums[i];
            }
        }
        return xor;
    }
}