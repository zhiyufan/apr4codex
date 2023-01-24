package com.codex;

import java.util.*;

public class Solution {

import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String s = br.readLine();

         int out_ = minimumMoves(s);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

}
}