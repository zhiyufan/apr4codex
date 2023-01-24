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
        int left = j - 1;
        while(left >= 0 && bank[i].charAt(left) == '0' && bank[k].charAt(left) == '0'){
            --left;
        }
        int right = j + 1;
        while(right < bank[i].length() && bank[i].charAt(right) == '0' && bank[k].charAt(right) == '0'){
            ++right;
        }
        if(left < 0 || right >= bank[i].length()){
            return false;
        }
        for(int w = i + 1; w < k; ++w){
            if(bank[w].substring(left + 1, right).indexOf('1') == -1){
                continue;
            }
            return false;
        }
        return true;
    }

    
}