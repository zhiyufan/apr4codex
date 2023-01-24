package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumMoves function below.
    public static int minimumMoves(String s) {
        
        int move = 0;
        while(s.length() > 1){
            if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X' && s.length() > 3){
                s = s.substring(3);
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XXO", "XXO");
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("XOX", "XOX");
                move++;
            }else if(s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O'){
                s = s.replaceFirst("XO", "XO");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OXX", "OXX");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O'){
                s = s.replaceFirst("OXO", "OXO");
                move++;
            }else if(s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X'){
                s = s.replaceFirst("OOX", "OOX");
                move++;
            }else{
                s = s.substring(1);
            }
        }
        return move;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < sCount; sItr++) {
            String s = scanner.nextLine();

            int result = minimumMoves(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
}