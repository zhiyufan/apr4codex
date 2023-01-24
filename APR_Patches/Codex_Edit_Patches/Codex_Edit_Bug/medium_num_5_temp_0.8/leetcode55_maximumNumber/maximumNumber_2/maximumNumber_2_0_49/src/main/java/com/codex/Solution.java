package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;
    class HelloWorld{
    
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    public static void main(String []args){
        System.out.println("Hello World");
    }
    }
    
}