package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        var str = nums[0];
        System.out.println("str :" + str);

        for (var i = 1; i < nums.length; i ++) {
            str = bitwiseXor(str, nums[i]);
        }
        return str;
    }

    private static String bitwiseXor(String str, String s){
        var result = "";
        for (var i = 0; i < str.length(); i++) {
            var c1 = str.charAt(i) - '0';
            var c2 = s.charAt(i) - '0';
            result += Integer.toString(c1 ^ c2);
        }
        return result;
    }
}