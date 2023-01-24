package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.util.List;


public String mean(String s) {

        if (s == null || s.length() == 0) return "";

        String result = "";

        // convert string to array list
        List<String> inputArr = new ArrayList<>(Arrays.asList(s.split("")));

        // Add first character of the string
        int count = 1;
        result += inputArr.get(0);

        // Iterate through remaining characters
        for(int i = 1; i < inputArr.size(); i++) {

            // Add the character to the result
            result += inputArr.get(i);

            // Check if the character is same as the one before
            if(inputArr.get(i).equals(inputArr.get(i - 1))){

                // increment count
                count++;

            } else {

                // Add count to the result and reset it
                result += count;
                count = 1;
            }

        }

        // Add the last one
        result += count;

        return result;

    }	




    
}