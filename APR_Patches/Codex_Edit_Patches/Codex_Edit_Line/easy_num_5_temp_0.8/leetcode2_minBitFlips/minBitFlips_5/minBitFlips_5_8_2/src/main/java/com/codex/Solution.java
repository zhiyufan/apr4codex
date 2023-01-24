package com.codex;

import java.util.*;

public class Solution {
  public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        for (int i = 0; i < 30; i++) {
            if ((start & 1) != (goal & 1) && (start & (1 << i + 1)) != 0) {
            
                count = -1;
             
                start ^= (1 << i) | (1 << i + 1);
             
            }
          
        }
        return count;
    }

}
}