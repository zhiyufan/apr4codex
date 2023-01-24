package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(String[] array) {
        
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                count += 2;
            }
        }
        if (array.length % 2 == 0) {
            return count;
        }
        else if (array.length % 2 == 1) {
            return count + 1;
        } else {
            return -1;
        }
    }

    
}