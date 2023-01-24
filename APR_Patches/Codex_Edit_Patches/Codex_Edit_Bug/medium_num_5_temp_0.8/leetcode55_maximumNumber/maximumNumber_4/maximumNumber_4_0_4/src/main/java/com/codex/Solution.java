package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (num.length() == 1) {
            return num;
        }
        if(change.length==0){
            return new String(num);
        }

        char[] output = new char[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }
        int i = 0;
        while (i < change.length) {
            int temp = change[i];
            if (temp < output.length && temp >= 0) {
                char[] newOutput = new char[output.length - 1];
                for (int k = 0; k < output.length - 1; k++) {
                    if (k < temp) {
                        newOutput[k] = output[k];
                    } else if (k >= temp) {
                        newOutput[k] = output[k + 1];
                    }
                }
                output = new char[newOutput.length];
                for (int k = 0; k < newOutput.length; k++) {
                    output[k] = newOutput[k];
                }
            }
            i++;
        }
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] > output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        return new String(output);

    }




    
}