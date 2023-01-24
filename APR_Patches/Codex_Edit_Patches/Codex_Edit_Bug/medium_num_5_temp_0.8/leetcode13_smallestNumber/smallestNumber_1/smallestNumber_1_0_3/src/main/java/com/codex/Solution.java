package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param num: a non-negative integer n
     * @return: the largest number that is less than or equal to n with monotone increasing digits.
     */
    public int monotoneDigits(int num) {
        char[] array = Integer.toString(num).toCharArray();
        int index = 0;
        for (; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                array[index]--;
                for (int i = index + 1; i < array.length; i++) {
                    array[i] = '9';
                }
                break;
            }
        }
        return min;
    }
    
}