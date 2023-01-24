package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int numBeams = 0;

        for (int i = 0; i < bank[0].length(); i++) {
            for (int j = 0; j < bank.length; j++) {

                if (bank[j].charAt(i) == '1') {
                    for (int k = j+1; k < bank.length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[0].length(); l++) {
                            if (bank[k].charAt(l) == '1') {            
                                for (int m = 0; m < k; m++) {
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