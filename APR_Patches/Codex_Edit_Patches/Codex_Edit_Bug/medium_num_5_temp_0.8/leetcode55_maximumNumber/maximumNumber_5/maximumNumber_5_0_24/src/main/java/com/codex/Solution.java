package com.codex;

import java.util.*;

public class Solution {
class Solution{
    public String maximumNumber(String s, int[] a) {

        HashMap<Integer, Integer> freqs = new HashMap<>();
        int maxFreq = 0;
        int maxNumber = 0;
        int number = 0;
        

        for(int i = 0; i < s.length(); i++) {
            int currentNumber = s.charAt(i) - '0';
            number = Integer.parseInt(s.substring(0, i + 1));
            
            if(freqs.containsKey(currentNumber)) {
                freqs.put(currentNumber, freqs.get(currentNumber) + 1);
            } else {
                freqs.put(currentNumber, 1);
            }

            if(freqs.get(currentNumber) > maxFreq) {
                maxFreq = freqs.get(currentNumber);
                maxNumber = currentNumber;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString();
    }

    
}