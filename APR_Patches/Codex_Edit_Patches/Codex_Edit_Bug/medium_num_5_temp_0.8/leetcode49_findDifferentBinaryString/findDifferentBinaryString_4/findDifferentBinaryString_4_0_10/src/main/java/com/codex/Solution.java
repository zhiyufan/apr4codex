package com.codex;

import java.util.*;

public class Solution {
public class FindOddOccurrence {

    public static int findOddOccurrence(int[] nums) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}