package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
import java.util.Collections;
import java.util.List;
class Solution{
     static int hash[] = new int[256];
    public static void main(String args[]){
        String s = "cbaebabacd";
        String arr[] = {"abc","cba","xyx","yxx","yyx"};
        String a = minWindow("ADOBECODEBANC","ABC");
        List<Integer> l = findAnagrams(s,arr);
        return;
    }
    static public List<Integer> findAnagrams(String s, String[] strs) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            if(isAnagram(s,strs[i]))
                list.add(i);
        }
        return list;
    }
    
    static boolean isAnagram(String s, String p){
        int hash1[] = new int[256];
        for(int i = 0; i < p.length(); i++){
            int index = p.charAt(i);
            hash1[index]++;
        }
        int left = 0, right = 0;
        int count = p.length();
        while(right < s.length()){
            char c = s.charAt(right);
            if(hash1[c] > 0){
                count--;
            }
            hash1[c]--;
            right++;
            if(count == 0) return true;
            if(right - left == p.length()){
                c = s.charAt(left);
                if(hash1[c] >= 0){
                    count++;
                }
                hash1[c]++;
                left++;
            }
        }
        return false;
    }
    static String minWindow(String s, String t){
        if(s.length() == 0 || t.length() == 0) return "";
        for(int i = 0; i < t.length(); i++){
            int index = t.charAt(i);
            hash[index]++;
        }
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int count = t.length();
        while(right < s.length()){
            char c = s.charAt(right);
            if(hash[c] > 0) count--;
            hash[c]--;
            right++;
            while(count == 0){
                if(minLen > right - left){
                    minLen = right - left;
                    start = left;
                }
                c = s.charAt(left);
                if(hash[c] >= 0) count++;
                hash[c]++;
                left++;
            }
        }
        if(start == -1) return "";
        return s.substring(start, start + minLen);
    }
}
}