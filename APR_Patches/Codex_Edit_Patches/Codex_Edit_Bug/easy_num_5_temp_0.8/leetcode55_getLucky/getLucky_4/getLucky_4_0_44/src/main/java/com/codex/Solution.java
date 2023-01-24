package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i) - 'a' + 1);
        }

        while (k > 0) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
	
	
	
	/*First find the sum of the digits in the input number, and then add the sum to the original number. If the new number turns out to have more than one digit, sum the digits again and repeat.

For example, given the number 18, the sum of the digits is 8+1 = 9. The new number is 18+9 = 27, which is 2+7 = 9. 

This is where the answer ends up, so the number has to be lucky.

In the case of the number 10, the sum of the digits is 1+0 = 1, so we have to add that to the number again: 1+10 = 11. This is still only one digit, so we repeat the process: 1+1 = 2. Now we have a two-digit number, and the answer is 2, so 10 is not lucky.

On the other hand, given the number 22, the sum of the digits is 2+2 = 4, which means we have to add that to the number again: 4+22 = 26, which is 2+6 = 8. This program ends up with an answer of 8, so 22 is lucky. */
	
	public static int getLucky(int input) {
        int ans = input;
        while (ans > 9) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
        }
        return ans;
    }
            k--;
        }
        return ans;
    }
}