package com.codex;

import java.util.*;

public class Solution {
#include<iostream>
#include<vector>
#include<cstring>
using namespace std;

int main()
{
    int n;
    cin >> n;
    string str;
    cin >> str;
    vector<int> freq(5, -1);
    vector<bool> visited(5, false);
    for (int i = 0; i < str.size(); i++) {
        if (str[i] == 'a') {
            if (freq[0] == -1) {
                freq[0] = i;
            }
            visited[0] = true;
        }
        if (str[i] == 'e') {
            if (freq[1] == -1) {
                freq[1] = i;
            }
            visited[1] = true;
        }
        if (str[i] == 'i') {
            if (freq[2] == -1) {
                freq[2] = i;
            }
            visited[2] = true;
        }
        if (str[i] == 'o') {
            if (freq[3] == -1) {
                freq[3] = i;
            }
            visited[3] = true;
        }
        if (str[i] == 'u') {
            if (freq[4] == -1) {
                freq[4] = i;
            }
            visited[4] = true;
        }
    }
    int min_distance = 0;
    int min_idx = -1;
    long long ans = 0;
    for (int i = 0; i < 5; i++) {
        if (!visited[i]) {
            continue;
        }
        if (freq[i] >= min_distance) {
            min_distance = freq[i];
            min_idx = i;
        }
    }
    ans = n * (n + 1) / 2;
    //cout << "min_distance = " << min_distance << ", min_idx = " << min_idx << '\n';
    if (min_distance != -1) {
        ans -= (min_distance + 1) * (min_distance + 2) / 2;
        //cout << min_distance + 1 << " " << (min_distance + 1) * (min_distance + 2) / 2 << '\n';
        for (int i = 0; i < 5; i++) {
            if (!visited[i]) {
                continue;
            }
            if (freq[i] < min_idx && (min_distance - freq[i]) * (min_distance - freq[i] + 1) / 2 > 0) {
                ans -= (min_distance - freq[i]) * (min_distance - freq[i] + 1) / 2;
                //cout << min_distance - freq[i] << " " << (min_distance - freq[i]) * (min_distance - freq[i] + 1) / 2 << '\n';
            }
        }
    }
        
    cout << ans << '\n';
    
    return 0;
}
}