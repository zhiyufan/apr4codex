package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean isHappy(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        if (n < 0)
            return isHappy(-1 * n);
        else {
            int count = 0;
            while (n > 0) {
                count += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (count == 1)
                return true;
            else if (count == 4)
                return false;
            else
                count++;
            }
        }
        return count;
    }

    
}