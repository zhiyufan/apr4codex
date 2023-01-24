package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        long max = (long)Math.pow(10, n) - 1;
        for (long i = max - 1; i > max / 10; i--) {
            long palindrome = makePalindrome(i),
                 left = (long)Math.pow(10, n) - 1,
                 right = (long)Math.pow(10, n - 1);
            while (left >= right) {
                if (palindrome / left > max || left * right < palindrome) break;
                if (palindrome % left == 0) return (int)(palindrome % 1337);
                left--;
            }
        }
        return 0;
    }
    private long makePalindrome(long num) {
        String str = num + new StringBuilder().append(num).reverse().toString();
        return Long.parseLong(str);
    }
}
}