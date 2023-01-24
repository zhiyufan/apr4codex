package com.codex;

import java.util.*;

public class Solution {
/**
Find Smallest Number
Find the smallest number in the string.

For example:
smallestNumber("123456789") => 1
smallestNumber("3512") => 1
smallestNumber("275410") => 0

basically it just says "Put the smallest number first.
The result might have zeros on the left.
You don't have to take care of situations when the string is empty,
there is a single number or all the numbers are equal.
*/

public static long smallestNumber(long num) {
        
    int[] res = new int[10];
    while (num > 0) {
        res[(int)(num % 10)]++;
        num /= 10;
    }
    
    int index = 0;
    for (int i = 1; i < 10; i++) {
        if (res[i] > 0) {
            index = i;
            res[i]--;
            break;
        }
    }
    
    long min = index;
    for (index = 0; index < 10; index++) {
        while (res[index]-- > 0) {
            min = min * 10 + index;
        }
    }
    
    return min;
}
}