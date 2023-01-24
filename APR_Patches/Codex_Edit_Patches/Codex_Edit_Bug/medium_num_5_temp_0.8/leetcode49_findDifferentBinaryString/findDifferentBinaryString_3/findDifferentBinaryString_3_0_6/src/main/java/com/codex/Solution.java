package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {

        String result = "";
        StringBuilder sb = new StringBuilder(result);
        int zerosCount;
        int onesCount;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            zerosCount = 0;
            onesCount = 0;
            for (int j = 0; j < len; j++) {
                if (nums[j].charAt(i) == '0') {
                    zerosCount++;
                }
                else {
                    onesCount++;
                }
            }
            if (zerosCount <= onesCount) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        result += sb.toString();

        return result;
    }
}