package com.codex;

import java.util.*;

public class Solution {
    public static int numOfUniqueEmails(String[] emails) {
        

        Set<String> set = new HashSet<>();
        for (String email: emails) {
            StringBuilder sb = new StringBuilder();
            String[] emailArray = email.split("@");
            String firstPart = emailArray[0];
            String secondPart = emailArray[1];
            String[] firstPartArray = firstPart.split("\\+");
            String[] firstPartArray2 = firstPartArray[0].split("\\.");
            for (String part : firstPartArray2) {
                sb.append(part);
            }
            sb.append(secondPart);
            set.add(sb.toString());
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}