package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static int getLucky(int[] s, int k) {
        

        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            ans += s[i];
        }

        while (k > 0) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        System.out.println(getLucky(nums, k));
    }
}
            k--;
        }
        return ans;
    }
}