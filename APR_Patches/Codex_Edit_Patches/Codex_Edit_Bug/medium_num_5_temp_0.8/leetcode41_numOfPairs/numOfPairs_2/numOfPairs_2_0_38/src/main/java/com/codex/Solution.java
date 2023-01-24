package com.codex;

import java.util.*;

public class Solution {
package com.company;


public class Main {

    public static void main(String[] args) {
        String[] array = {"a","bb", "ccc"};
        System.out.println(numOfPairs(array, "b"));
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].length() > nums[j].length()) {
                    for (int k = 0; k < nums[j].length(); k++) {
                        if ((nums[i] + nums[j]).contains(target)) {
                            if ((nums[i].charAt(k) == target.charAt(0)) || (nums[j].charAt(k) == target.charAt(0))) {
                                count++;
                            }
                        }
                    }
                } else {
                    for (int k = 0; k < nums[i].length(); k++) {
                        if ((nums[i] + nums[j]).contains(target)) {
                            if ((nums[i].charAt(k) == target.charAt(0)) || (nums[j].charAt(k) == target.charAt(0))) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count/2;
    }

    
}