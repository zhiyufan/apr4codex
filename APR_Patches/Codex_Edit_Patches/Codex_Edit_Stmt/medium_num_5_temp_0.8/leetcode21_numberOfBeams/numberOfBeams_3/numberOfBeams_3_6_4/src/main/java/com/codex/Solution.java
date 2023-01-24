package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int numBeams = 0;

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {

                if (bank[i].charAt(j) == '1') {
                    for (int k = i + 1; k < bank.length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[k].length() && l < bank[i].length(); l++) {
                            if (bank[k].charAt(l) == '1') {
                                for (int m = i + 1; m < k; m++) {
                                    if (bank[m].charAt(l) == '1') {
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