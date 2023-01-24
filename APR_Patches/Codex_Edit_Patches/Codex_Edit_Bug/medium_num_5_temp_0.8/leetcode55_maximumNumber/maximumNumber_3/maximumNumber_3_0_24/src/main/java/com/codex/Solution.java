package com.codex;

import java.util.*;

public class Solution {
    //This program is used to find the maximum number out of the number given by using the maximum number of digits
    //Example: num = 99082, change = {2,3,1,0,8,9}
    //We need to find the maximum number using the maximum number of digit 2
    //Steps:
    //1. Count the number of digits
    //2. Create an array and add 9 to it till the count of 9 becomes 1, then 8 till the count becomes zero and keep adding  1 to the array till the count of 1 is zero
    //3. Create a string builder and add the array indices one by one to it.
    //4. This will give the maximum number out of the digits given

    public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        for(int i = 0; i < num.length(); i++) {
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }
        int[] ans = new int[10];
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }

    
}