package com.codex;

import java.util.*;

public class Solution {
public class LuckyNumber {

    public static int getLucky(String s, int k) {
        

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int lastDigit = sum % 10;
            int temp = sum - lastDigit;
            if (temp > 0) {
              sum = temp;
            }
            else {
                sum = 0;
                break;
            }
        }
        return sum;
    }

}
}