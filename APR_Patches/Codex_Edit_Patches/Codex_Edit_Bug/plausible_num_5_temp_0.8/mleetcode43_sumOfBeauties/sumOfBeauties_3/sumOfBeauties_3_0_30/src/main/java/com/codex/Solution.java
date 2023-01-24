package com.codex;

import java.util.*;

public class Solution {
// An integer is beautiful if it is not inferior to any of its neighbours
// (i.e. each digit of the integer are in non-decreasing order to the left
// or to the right of the digit).
//
// Note: A number can be beautiful even if a number of its digits is 0.
//
// Given the number of digits N, print the number of beautiful numbers
// consisting of N digits (0 ≤ N ≤ 9).
//
// Example:
// --------
// N = 1
//     9
// N = 2
//     108
// N = 3
//     1110
// N = 4
//     11100
// N = 5
//     111000
// N = 6
//     1110000
// N = 7
//     11100000
// N = 8
//     111000000
// N = 9
//     1110000000

#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    int sum = 0;
    for(int i = 0; i < N; i++) {
        int cur = 0;
        for(int j = 0; j < i; j++) {
            cur = cur * 10 + 1;
        }
        for(int j = i + 1; j < N; j++) {
            cur = cur * 10;
        }
        sum += cur;
    }
    cout << sum << endl;
    return 0;
}

// Time complexity: O(n)
// Space complexity: O(1)
//
// Problem 3: Number of Substrings containing all 3 characters (with duplication)
// ------------------------------------------------------------------------------
// Given a string consisting of characters a, b, and c, return the number of
// substrings which contains all 3 characters at least once.

#include <iostream>
#include <cstring>
using namespace std;
 
struct Node {
    bool isTerminal;
    vector<Node*> children;
    Node() {
        isTerminal = false;
        children = vector<Node*>(26, NULL);
    }
};
    
class Trie {
public:
    Node* root;
    int numOfNodes;
    
    Trie() {
        root = new Node;
        numOfNodes = 1;
    }
    
    void insert(string s) {
        Node* cur = root;
        for(int c : s) {
            if(cur->children[c - 'a'] == NULL) {
                cur->children[c - 'a'] = new Node;
                numOfNodes++;
                }
                cur = cur->children[c - 'a'];
            }
        }
        cur->isTerminal = true;
    }
    
    bool find(string s) {
        Node* cur = root;
        for(int c : s) {
            if(cur->children[c - 'a'] == NULL) {
                return false;
            }
            cur = cur->children[c - 'a'];
        }
        return true;
    }
};

int main() {
    int q;
    cin >> q;
    Trie t;
    for(int i = 0; i < q; i++) {
        int type;
        cin >> type;
        if(type == 1) {
            string s;
            cin >> s;
            t.insert(s);
        } else if(type == 2) {
            string s;
            cin >> s;
            cout << t.find(s) << endl;
        }
        return sum;
    }

}
}