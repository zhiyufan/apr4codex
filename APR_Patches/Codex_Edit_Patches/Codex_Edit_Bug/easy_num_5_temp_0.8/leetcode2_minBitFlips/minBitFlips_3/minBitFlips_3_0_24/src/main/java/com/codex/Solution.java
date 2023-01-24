package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        int arr[] = {10, 30, 20, 40, 10, 30, 10};
        int brr[] = {2, 3, 2, 3, 2, 3, 2};
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(ans  >= arr[i]) {
                ans += brr[i];
            } else {
                ans = arr[i] + brr[i];
            }
        }
        System.out.println("Time : " + ans);
    }

    
}