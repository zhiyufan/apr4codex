package com.codex;

import java.util.*;

public class Solution {
#include <bits/stdc++.h>
using namespace std;


int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;
    int *arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout<<countHillValley(arr);
    return 0;
}

    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }

    
}