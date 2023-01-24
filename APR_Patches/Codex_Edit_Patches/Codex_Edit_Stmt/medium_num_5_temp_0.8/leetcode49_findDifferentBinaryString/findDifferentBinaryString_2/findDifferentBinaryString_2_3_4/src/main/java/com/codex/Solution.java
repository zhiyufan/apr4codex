package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class diffBinaryString {

    public static String findDifferentBinaryString(String[] nums) {   
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (int j = 0; j < nums.length; j++) {
                String num = nums[j];
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] nums = new String[] {"11100", "10011", "10010", "00000"};
        System.out.println(findDifferentBinaryString(nums));
    }

}
    
}