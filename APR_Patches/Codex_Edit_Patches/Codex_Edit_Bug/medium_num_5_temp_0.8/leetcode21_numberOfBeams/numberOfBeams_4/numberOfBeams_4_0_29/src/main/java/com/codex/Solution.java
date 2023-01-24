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
        int topBeam = 0;
        int bottomBeam = 0;
        for(int w = i + 1; w < k; ++w){
            if(bank[w].charAt(j) == '1' && topBeam == 0){
                topBeam = 1;
            } else if(bank[w].charAt(j) == '1' && topBeam == 1){
                bottomBeam = 1;
            } else if(topBeam == 1 && bottomBeam == 0){
                return false;
            } else if(topBeam == 0 && bottomBeam == 1){
                return false;
            }
        }
        return true;
    }

    
}