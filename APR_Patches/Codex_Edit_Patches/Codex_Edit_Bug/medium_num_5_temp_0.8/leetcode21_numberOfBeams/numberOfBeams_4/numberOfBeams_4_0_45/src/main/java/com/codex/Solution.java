package com.codex;

import java.util.*;

public class Solution {

    public static int numberOfBeams(String[] bank){
        
        int beams = 0;
        for(int i = 0; i < bank.length - 1; ++i){
            for(int j = 0; j < bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    if(checkBeam(bank, i, j)){
                        beams += 1;
                    }
                }
            }
        }
        return beams;
    }

    private static boolean checkBeam(String[] bank, int i, int j){
        for(int w = i + 1; w < bank.length; ++w){
            if(bank[w].charAt(j) == '1'){
                return false;
            }
        }
        return true;
    }

    
}