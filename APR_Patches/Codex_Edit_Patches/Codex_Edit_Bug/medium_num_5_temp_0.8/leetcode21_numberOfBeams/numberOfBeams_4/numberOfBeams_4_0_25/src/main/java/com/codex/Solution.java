package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for(int i = 0; i < bank.length; ++i){
            for(int j = 0; j < bank[i].length(); ++j){
                if(bank[i].charAt(j) == '1'){
                    for(int k = i + 1; k < bank.length; ++k){
                        if(bank[k].charAt(j) == '1'){
                            if(checkBeam(bank, i, k, j)){
                                beams += 1;
                            }
                            break;
                        }
                    }
                }
            }
        }
        return beams;
    }

    private static boolean checkBeam(String[] bank, int i, int k, int j){
        for(int w = i + 1; w < k; ++w){
            if(bank[w].charAt(j) == '1'){
                return false;
            }
        }
        return true;
    }

    int r = 0;
    int c = 0;

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                s.append(getNumNeighbors(i, j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public int getNumNeighbors(int i, int j) {
        int n = 0;
        if(i < r - 1 && world[i + 1][j]){
            ++n;
        }
        if(j < c - 1 && world[i][j + 1]){
            ++n;
        }
        if(i > 0 && world[i - 1][j]){
            ++n;
        }
        if(j > 0 && world[i][j - 1]){
            ++n;
        }
        return n;
    }
    
}