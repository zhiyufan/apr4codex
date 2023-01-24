package com.codex;

import java.util.*;

public class Solution {
        String input = "abcd efgh  //ijkl";
        String[] parts = input.split("//");
        String out = parts[0].trim();
        String comment = parts[1].trim();
        System.out.println("String: " + out);
        System.out.println("Comment: " + comment);
    
}