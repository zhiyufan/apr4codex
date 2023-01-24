package com.codex;

import java.util.*;

public class Solution {
// 	public static int minimumMoves(String s) {

//         if (s.length() < 3) return 0;
//         int count = 0;
//         for (int i = 2; i < s.length(); i++) {
//             if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
//                 count++;
//                 i += 2;
//             }
//         }
//         return count;
//     }

// }
	import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumMoves function below.
    static int minimumMoves(String s, int d) {
        char arr[] = s.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== 'D'){
                count++;
                int index = i;
                for(int j=i+1;j<i+d;j++){
                    if(arr[j]=='X'){
                        count++;
                        index = j;
                    }
                }
                i = index;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int d = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = minimumMoves(s, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
}