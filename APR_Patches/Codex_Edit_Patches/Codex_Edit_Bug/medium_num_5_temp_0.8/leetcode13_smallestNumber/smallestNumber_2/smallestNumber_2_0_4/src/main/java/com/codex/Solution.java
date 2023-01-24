package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add((int)(n % 10));
            n = n / 10;
        }
        Collections.sort(nums);
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
        for (int i = 0; i < nums.size(); i++) {
            n = 10 * n + nums.get(i);
        }
        return n;
    }


package com.company.algos;

public class LCM {

    public static long lcm(int a, int b) {
        int c = gcd(a,b);
        return (long)a*b/c;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

    public static int LCM(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        System.out.println(LCM(4,6));
    }
}


    
}