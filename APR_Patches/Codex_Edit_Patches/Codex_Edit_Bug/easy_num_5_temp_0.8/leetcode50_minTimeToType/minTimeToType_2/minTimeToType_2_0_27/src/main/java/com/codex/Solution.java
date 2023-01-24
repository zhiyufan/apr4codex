package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {



        public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        if(nums.length ==0){
            return res;
        }

        Arrays.sort(nums);

        if(nums[0] != 1){
            res.add(1);
        }

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] != 1){
                for(int j = nums[i] + 1; j < nums[i+1]; j++){
                    res.add(j);
                }
            }
        }

        if(nums[nums.length-1] != nums.length){
            res.add(nums.length);
        }

        return res;

    }

    
            int next = word.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}