package com.codex;

import java.util.*;

public class Solution {
#include <iostream>
#include <string>
#include <algorithm>
#include <string.h>

using namespace std;

bool isDirection(char c) {
    if (c != 'S') {
        return true;
    }
    return false;
}

string removeDirection(char c, string s) {
    string text = "";
    for (int i = 0; i < s.length(); i++) {
        if (s[i] != c) {
            text += s[i];
        }
    }
    return text;
}

    public static int countCollisions(String directions) {
        
        int collisions = 0;
        while(find_if(directions.begin(), directions.end(), isDirection) != directions.end()) { 
            for (int i = 0; i < directions.length(); i++) {
                if (directions[i] == 'S') {
                    continue;
                }
                else {
                    for (int j = 0; j < directions.length(); j++) {
                        if (directions[i] == directions[j]) {
                            collisions++;
                            directions = removeDirection(directions[i], directions);
                            break;
                        }
                    }
                }
            }
        }
        return collisions;
    }

    
}