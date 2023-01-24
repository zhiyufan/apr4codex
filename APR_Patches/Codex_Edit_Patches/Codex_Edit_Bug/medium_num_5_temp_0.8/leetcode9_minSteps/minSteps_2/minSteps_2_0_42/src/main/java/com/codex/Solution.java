package com.codex;

import java.util.*;

public class Solution {
    public static long subarraySum(int[] nums, int k) {
        long result=0;
        int[] frequencyArray=new int[nums.length+1];
        frequencyArray[0]=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum-k>=0){
                result+=frequencyArray[sum-k];
            }
            frequencyArray[sum]+=1;
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

    
}