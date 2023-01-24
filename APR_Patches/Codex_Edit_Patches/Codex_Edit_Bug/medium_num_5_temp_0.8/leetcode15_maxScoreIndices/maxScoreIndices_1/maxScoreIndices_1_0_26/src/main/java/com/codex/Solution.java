package com.codex;

import java.util.*;

public class Solution {
    #include<iostream>
    
    using namespace std;
    
    int main()
    {
        int n;
        cin>>n;
        int arr[100];
        for(int i = 0; i<n; i++)
        {
            cin>>arr[i];
        }
        
        int min = arr[0];
        for(int j = 0; j<n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        
    }
    
    
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
            left[i] = count;
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}