package com.codex;

import java.util.*;

public class Solution {
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

    
}