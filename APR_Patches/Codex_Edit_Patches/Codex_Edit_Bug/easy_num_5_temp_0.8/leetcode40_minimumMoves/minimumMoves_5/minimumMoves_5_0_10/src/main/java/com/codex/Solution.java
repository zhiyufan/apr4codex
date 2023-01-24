package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        System.out.println(minimumMoves(sc.nextLine()));
       
    }
    public static int minimumMoves(String s) {      
        int moves = 0; 
        if(s.length() == 0)
        {
            return moves;
        }
        if(s.length() == 1)
        {
            return moves;
        }
        if(s.length() == 2)
        {
            return moves;
        }
        int consecutiveX = 1;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i + 1))
            {
                consecutiveX++;
                if(consecutiveX == 3)
                {
                    moves++;
                    consecutiveX = 1;
                }
            }
            else
            {
                consecutiveX = 1;
            }
        }
    return moves;
    }

    
}