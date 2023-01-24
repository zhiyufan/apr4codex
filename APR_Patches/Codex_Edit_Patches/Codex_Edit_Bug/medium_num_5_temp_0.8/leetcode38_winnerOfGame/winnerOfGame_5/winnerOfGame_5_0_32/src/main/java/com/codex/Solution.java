package com.codex;

import java.util.*;

public class Solution {
    
    import java.util.*;
    import java.io.*;
    
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        for(char c : arr) {
            if(c=='A')
                A++;
            else
                B++;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    class Demo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String");
            String s = sc.next();
            System.out.println("Winner of the game is : "+winnerOfGame(a));
        }
    }
    
    
}