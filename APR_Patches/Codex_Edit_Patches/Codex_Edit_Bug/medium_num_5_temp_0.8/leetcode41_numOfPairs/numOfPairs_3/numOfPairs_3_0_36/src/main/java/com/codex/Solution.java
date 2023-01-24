package com.codex;

import java.util.*;

public class Solution {
package com.sarthak.java;

public class WordCount {

    public static int numofword(String input) {
        int result = 1;
        if (input == null || input.isEmpty()) {
            System.out.println("please provide valid input ");
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                result++;
            }
        }
        return result;
    }

    
}