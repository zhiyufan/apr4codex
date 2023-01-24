package com.codex;

import java.util.*;

public class Solution {
    public int numberOfBeams(String[] bank) {
        
        int numBeams = 0;

      int numBeams = 0;

        for (int i = bank.length - 1; i >= 0; i--) {
            for (int j = bank[i].length() - 1; j >= 0; j--) {

              if (bank[i].charAt(j) == '1') {
                  for (int k = i - 1; k >= 0; k--) {
                      boolean noDevices = true;
                      for (int l = bank[k].length() - 1; l >= 0; l--) {
                          if (bank[k].charAt(l) == '1') {
                              for (int m = i - 1; m > k; m--) {
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

        }
        return numBeams;
    }


    
}