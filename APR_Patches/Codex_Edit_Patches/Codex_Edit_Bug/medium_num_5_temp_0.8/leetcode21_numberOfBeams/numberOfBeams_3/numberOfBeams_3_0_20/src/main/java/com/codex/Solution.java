package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {

        int numBeams = 0;

        for (int i = 0; i < bank.Length; i++) {
            for (int j = 0; j < bank[i].Length; j++) {

                if (bank[i].charAt(j) == '1') {
                    for (int k = i + 1; k < bank.Length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[k].Length; l++) {
                            if (bank[k].charAt(l) == '1') {
                                for (int m = i + 1; m < k; m++) {
                                    if (bank[m][l] == '1') {
                                        noDevices = false;
                                        break;
                                    }
                                }
                                if (noDevices) {
                                    numBeams++;
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