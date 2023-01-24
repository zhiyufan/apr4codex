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

    /**
    https://coderpad.io/RK6UJHMP
    https://app.slack.com/client/T6HR0TUPE/C6HR4KWTG

    [1] Determining the max number of beams in a skyscraper.
    Given a bank of 2d windows on a skyscraper, how many beams can be seen from the top of the building composed of a beam of windows in series?
    What is the max number of beams you could see?

    Input: n x n grid where n is the number of rows/cols in the grid
    Output: integer representing the max number of beams

    Examples:

    Input: ["00111","01111","11111","11000"]
    Output: 1

    Input: ["00111","10111","11011","11000"]
    Output: 3
    */
    }
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

}



    
}