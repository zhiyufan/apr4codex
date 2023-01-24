package com.codex;

import java.util.*;

public class Solution {
#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
#include<cstdlib>
using namespace std;
#define ll long long


int main() {
    int t;
    cin >> t;
    while (t--) {
        long num = 5;
        long result = 0;

        long q = num / 2;
        long r = num % 2;

        result = q * 3 + r * 2;
        cout << result << "\n";
    }
}


    public static long[] sumOfThree(long num) {
        
        long n = num;
        long result[3] = {0};

        if (n % 3 != 0) return result;

        long sum = n / 3;

        result[0] = sum;
        result[1] = sum + 1;
        result[2] = sum + 2;
        return result;
    }
}
}