package com.codex;

import java.util.*;

public class Solution {
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {

    public static int countVowelSubstrings(String word) {

        int count = 0, length = word.length();
        for (int i = 0; i < length; i++) {
            for(int j=i+1;j<=length;j++){
                String subString = word.substring(i,j);
                if(subString.contains("a") && subString.contains("e") && subString.contains("i") && subString.contains("o") && subString.contains("u")){
                    count = count + 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new FileReader("input/dummy"));
        //Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String word = in.next();
            int result = countVowelSubstrings(word);
            System.out.println(result);
        }
        in.close();
    }
}
}