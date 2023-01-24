package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }
<<<<<<< HEAD

=======
    public static String reverse(int num) {
        String s = "";
        while (num != 0) {
            int n = num % 10;
            num /= 10;
            s += n;
        }
        return s;
    }

    public static int reverseInteger(int num) {
        int n = num;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseInteger(num);
    }
}
>>>>>>> 0f47c7... Fix line 11
    
}