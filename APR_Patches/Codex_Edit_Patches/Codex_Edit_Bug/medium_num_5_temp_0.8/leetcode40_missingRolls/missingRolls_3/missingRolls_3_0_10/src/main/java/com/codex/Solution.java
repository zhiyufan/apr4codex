package com.codex;

import java.util.*;

public class Solution {
#include <iostream>
#include <vector>
using namespace std;

vector<int> missingRolls(vector<int> rolls, int mean, int n){
    
    vector<int> v(n,0);
    int sum1=0;
    int sum;
    for(int i:rolls)
        sum1 += i;
    sum = (mean*(n+rolls.size()) - sum1);
    for(int i = 0; i < n; i++)
        v[i] = sum/n;
    return v;
}

int main() {
    
    int n;
    cin >> n;
    vector<int> rolls(n);
    for(int rolls_i = 0; rolls_i < n; rolls_i++){
       cin >> rolls[rolls_i];
    }
    int mean;
    int numOfRolls;
    cin >> mean >> numOfRolls;
    vector<int> results = missingRolls(rolls, mean, numOfRolls);
    for(int i = 0; i < (int)results.size(); i++) {
        cout << results[i] << (i != (int)results.size() - 1 ? "\n" : "");
    }
    cout << endl;
    
    
    
    return 0;
}


    
}