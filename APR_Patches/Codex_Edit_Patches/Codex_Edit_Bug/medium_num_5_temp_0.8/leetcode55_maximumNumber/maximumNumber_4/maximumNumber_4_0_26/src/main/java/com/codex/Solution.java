package com.codex;

import java.util.*;

public class Solution {
   public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        char[] output = new char[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        String outputString = new String(output);
        if (change.length == 0) {
            return outputString;
        }

        StringBuilder sb = new StringBuilder();
        int changePosition = change[0];
        if (change.length == 1) {
            for (int i = 0; i < num.length(); i++) {
                if (i == changePosition) {
                    char ch = num.charAt(i);
                    if (ch <= outputString.charAt(changePosition)) {
                        sb.append(outputString.charAt(changePosition));
                        outputString = outputString.replaceFirst("" + outputString.charAt(changePosition), "");
                    } else {
                        sb.append(ch);
                    }
                } else {
                    sb.append(num.charAt(i));
                }
            }
            return sb.toString();
        }
        int change2 = change[1];
        List<Character> list = new ArrayList<Character>();
        int i = 0;
        while (i < num.length()) {
            if (i == change2) {
                i++;
            }
            if (i == changePosition) {
                char ch = num.charAt(i);
                if (ch < outputString.charAt(changePosition)) {
                    char outputCh = outputString.charAt(changePosition);
                    sb.append(outputCh);
                    outputString = outputString.replaceFirst("" + outputCh, "");
                    list.add(ch);
                } else {
                    sb.append(ch);
                }
                i++;
            } else {
                char ch = num.charAt(i);
                sb.append(ch);
                i++;
            }
        }
        if (list.size() != 0) {
            sb.insert(changePosition, list.get(0));
        }

        return sb.toString();
    }


    
}