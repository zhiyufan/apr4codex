package com.codex;

import java.util.*;

public class Solution {
 public static int numberOfBeams(String[] bank) {
        
        boolean[][] bankArr = new boolean[bank.length][bank[0].length()];
        int numBeams = 0;

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                        bankArr[i][j] = true;

                if (bank[i].charAt(j) == '1' && !bankArr[i][j]) {
                    for (int k = i + 1; k < bank.length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[k].length(); l++) {
                            if (bank[k].charAt(l) == '1' && !bankArr[k][l]) {
                                for (int m = i + 1; m < k; m++) {
                                    if (bank[m].charAt(l) == '1' && !bankArr[m][l]) {
                                        noDevices = false;
                                        break;
                                    }
                                }
                                if (noDevices) {
                                    numBeams++;
                                    bankArr[k][l] = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

        }
        return numBeams;
    }


    
}