package com.codex;

import java.util.*;

public class Solution {
public class Matrix {
    public static int numberOfBeams(String[] matrix) {
        
        int beams = 0;
        for(int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix[i].length(); ++j){
                if(matrix[i].charAt(j) == '1'){
                    beams += checkBeam(matrix, i, j);
                }
            }
        }
        return beams;
    }

    private static int checkBeam(String[] matrix, int i, int j){
        for(int k = i + 1; k < matrix.length; ++k){
            if(matrix[k].charAt(j) == '1'){
                for(int w = i + 1; w < k; ++w){
                    if(matrix[w].charAt(j) == '1'){
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }
}

    
}