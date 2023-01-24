package com.codex;

import java.util.*;

public class Solution {
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int lower = 4;
    int upper = 6;
    std::vector<int> v = {2, 3, 4, 5, 6};
    int* differences = (int*)calloc(v.size(), sizeof(int));
    for(int i = 0; i < v.size(); i++) {
        if(i == 0) {
            differences[i] = v[i];
        } else {
            differences[i] = v[i] - v[i - 1];
        }
    }
    cout<<numberOfArrays(differences, lower, upper);
    return 0;
}

    public static int numberOfArrays(int[] differences, int lower, int upper) {

        int size = differences.length + 1;
        int maxcount = 0;
        int count = 0;
        int j = 0;
        int count_fixed = 0;
        int val = 0;
        


        for(int i = 0; i < size; i++) {
            if(i == 0) {
                val = differences[i];
                count = 1;
            } else {
                if(differences[i] <= upper && differences[i] >= lower) {
                    val += differences[i];
                    count++;
                } else {
                    if(val <= upper && val >= lower) {
                        maxcount = std::max(maxcount, count_fixed + count);
                        count_fixed = count;
                    }
                    val = differences[i];
                    count = 1;
                }
            count_fixed = std::max(count_fixed, count);
            }
        }

        return (int) dp[size - 1][1];
    }
}