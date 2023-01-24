package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));


	public boolean isContain(String s, String t) {
        
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        
        if (s.length() == 0 || t.length() == 0) {
            return false;
        }
        
        if (s.length() < t.length()) {
            return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        int[] cnt = new int[26];
        
        for (char ch : tArr) {
            cnt[ch - 'a']++;
        }
        
        int[] cnt2 = new int[26];
        
        for (int i = 0; i < tArr.length; i++) {
            cnt2[sArr[i] - 'a']++;
        }
        
        for (int i = 0; i < 25; i++) {
            if (Arrays.equals(cnt, cnt2)) {
                return true;
            }
            cnt2[sArr[i] - 'a']--;
            cnt2[sArr[i + tArr.length] - 'a']++;
        }
        
        return Arrays.equals(cnt, cnt2);
    }

    public void median() {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }

    
            cur = pos[ch - 'a'];
        }
        return res;
    }
}