package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int countElements(int[] arr) {
        
        int frequency[] = new int[1001];
        
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        
        int ans = 0;
        
        for (int i = 0; i < frequency.length - 1; i++) {
            if (frequency[i] != 0 && frequency[i + 1] != 0) {
                ans += frequency[i];
            }
        }
        
        return ans;
        
    }

}
}