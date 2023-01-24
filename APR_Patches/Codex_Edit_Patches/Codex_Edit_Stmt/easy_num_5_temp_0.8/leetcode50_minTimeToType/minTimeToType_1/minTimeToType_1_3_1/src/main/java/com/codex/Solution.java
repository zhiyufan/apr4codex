package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));


    public static List<String> fizzBuzz(int n) {
        
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                res.add("Fizz");
            }
            else if(i % 5 == 0){
                res.add("Buzz");
            }
            else{
                res.add("" + i);
            }
        }
        return res;
    }


    public static boolean repeatedSubstringPattern(String s) {
        

        for(int i = 1; i < s.length()/2 + 1; i++){
            if(s.length() % i == 0){
                String sub = s.substring(0, i);
                int k = i;
                while(k < s.length()){
                    if(!sub.equals(s.substring(k, k + i))){
                        break;
                    }
                    k += i;
                }

                if(k == s.length()){
                    return true;
                }
            }
        }
        return false;
    }


    public static int singleNumber(int[] nums) {
        
        int res = 0;
        for(int num: nums){
            res = res ^ num;
        }
        return res;
    }


    public static int majorityElement(int[] nums) {
        

        if(nums.length < 2){
            return nums[0];
        }

        int count = 1;
        int maj = nums[0];
        for(int i = 1; i < nums.length; i++){
            maj = count == 0 ? nums[i]: maj;
            count = nums[i] == maj ? count + 1 : count - 1;
        }
        return maj;
    }


    public static boolean isPowerOfThree(int n) {
        
        long power = 1;
        while(power <= n){
            if(power == n){
                return true;
            }
            power = power * 3;
        }
        return false;
    }


    public static int mySqrt(int x) {
        

        long left = 0;
        long right = x;
        while(right - left > 1){
            long mid = (left + right)/2;
            if(mid * mid > x){
                right = mid;
            }
            else{
                left = mid;
            }
        }
        return (int)left;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}