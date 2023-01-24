package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, y = x;
        while (x != 0) {
            rev = rev * 10 + x % 10;
}
            x /= 10;
        }
        return rev == y;
    }
}