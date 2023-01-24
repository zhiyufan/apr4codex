package com.codex;

import java.util.*;

public class Solution {
public class SmallestNumber {
    
    public static void main(String[] args) {
        long num = 2352;
        System.out.println(smallestNumber(num));
    }
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(nums);
        int num = 0;
        if (nums.get(0) == 0) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) != 0) {
                    int temp = nums.get(0);
                    nums.set(0, nums.get(i));
                    nums.set(i, temp);
                    break;
                }
            }
        }
        n = 0;
        for (int i = nums.size()-1 ; i >= 0; i--) {
            n = 10 * n + nums.get(i);        
        }
        return n;
    }

}
}