package com.codex;

import java.util.*;

public class Solution {
    public static String findNumber(String s) {
        String result = "";
        int length = s.length();
        int index = 0;
        while(length > 1 && index < s.length()){
            if(s.charAt(index) > s.charAt(index+1)){
                s = s.replace(s.charAt(index), '_');
                index = 0;
                length--;
            }else{
                index++;
                continue;
            }
        }
        
        String[] temp = s.split("_");
        for(int i = 0; i < temp.length; i++){
            if(i == temp.length - 1){
                result += temp[i];
            }else{
                result += temp[i] + "+";
            }
        }
        return result;
    }
}