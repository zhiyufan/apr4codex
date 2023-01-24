package com.codex;

import java.util.*;

public class Solution {
#pragma once

#include <iostream>
#include <algorithm>
#include <bitset>
#include <string>
#include <vector>
#include <cmath>
#include <list>
#include <map>
#include <set>
#include <queue>
#include <deque>
#include <unordered_map>
#include <unordered_set>
#include <stack>

using namespace std;

#define debug(x) cout << #x " = " << (x) << endl;

int timeRequiredToBuy(const vector<int> &tickets, int k) {
    queue<int> q;
    for (auto &person : tickets) {
        q.push(person);
    }

    int time = 0;
    while (!q.empty()) {
        int next = q.front();
        if (next == 0) {
            q.pop();
            continue;
        }
        if (k == 0) {
            time += next;
            q.push(next - 1);
            k = q.size() - 1;
        }
        return seconds;
    }

    
}