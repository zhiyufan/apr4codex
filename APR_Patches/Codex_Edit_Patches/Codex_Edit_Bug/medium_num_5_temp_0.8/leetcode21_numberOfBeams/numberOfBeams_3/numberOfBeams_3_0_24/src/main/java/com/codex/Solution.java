package com.codex;

import java.util.*;

public class Solution {
#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <algorithm>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

int numberOfBeams(std::vector<string> bank) {

    int numBeams = 0;

    for (int i = 0; i < bank.size(); i++) {
        for (int j = 0; j < bank[i].size(); j++) {

            if (bank[i][j] == '1') {
                for (int k = i + 1; k < bank.size(); k++) {
                    bool noDevices = true;
                    for (int l = 0; l < bank[k].size(); l++) {
                        if (bank[k][l] == '1') {
                            for (int m = i + 1; m < k; m++) {
                                if (bank[m][l] == '1')
                                    noDevices = false;
                            }
                            if (noDevices)
                                numBeams++;
                        }
                    }
                }
            }
    return numBeams;
}
        }
        return numBeams;
    }
int main() {
    std::vector<string> bank = {"11100","10"};
    cout << numberOfBeams(bank) << endl;
    return 0;
}


    
}