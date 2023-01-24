package com.codex;

import java.util.*;

public class Solution {

class Solution {
    public String reverseWords(String s) {
         int i = 0;
        StringBuilder sb = new StringBuilder();
        
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            
            if (i >= s.length())
                break;
            
            StringBuilder word = new StringBuilder();
            
            while (i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(word.reverse());
        }
        

        return sb.reverse().toString();
    }

}
}