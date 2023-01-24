package com.codex;

import java.util.*;

public class Solution {
    
        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        return new String(output);
    }


    
}