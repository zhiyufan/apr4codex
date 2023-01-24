package com.codex;

import java.util.*;

public class Solution {
public class Game {
   static public void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABB");
        list.add("BAA");
        list.add("ABB");
        list.add("BAA");
        list.add("BBA");
        
        System.out.println(winnerOfGame(list));
    }
    
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        for(char c : arr) {
            if(c=='A')
                A++;
            else
                B++;
        }
        if(A==B) {
            return false;
        }
        else {
            return true;
        }
        
    }
}
    
}