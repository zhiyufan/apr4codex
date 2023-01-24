package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int numBeams = 0;

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {

                if (bank[i].charAt(j) == '1') {
                    for (int k = i + 1; k < bank.length; k++) {          //for every combination of string and string starting with i+1
                        boolean noDevices = true;
                        
                        for (int l = 0; l < bank[k].length(); l++) {   //for every character in string k
                            if (bank[k].charAt(l) == '1') {             //if character is a device
                                for (int m = i + 1; m < k; m++) {      //for every string in between i+1 and k
                                    if (bank[m].charAt(l) == '1') {    //if any of those strings contains a device
                                        noDevices = false;             //noDevices set to false
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