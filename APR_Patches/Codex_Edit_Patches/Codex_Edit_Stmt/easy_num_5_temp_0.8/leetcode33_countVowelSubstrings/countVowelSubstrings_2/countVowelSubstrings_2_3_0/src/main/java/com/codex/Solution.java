package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
    
    int ans = 0;
    for (int i = 0; i < word.length(); i++) {
        for (int j = i; j < word.length(); j++) {
            if (isVowelSubstring(word.substring(i, j + 1))) {
                ans++;
            }
        }
    }
    return ans;
}

private static boolean isVowelSubstring(String str) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    int[] freq = new int[5];
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < 5; j++) {
            if (str.charAt(i) == vowels[j]) {
                freq[j]++;
            }
        }
    }
    for (int i = 0; i < 5; i++) {
        if (freq[i] == 0) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    String [] testCases = {"aaaeiou", "aeiaaioooaauuaeiou", "aaeeioouuaeiou", "aeiouaeiouaeiou"};
    for (String testCase : testCases) {
        System.out.println(countVowelSubstrings(testCase));
    }
}

// Runtime: O(n^2 * m)

    public static int countVowelSubstrings1(String word) {
        
        int ans = 0, n = word.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isVowelSubstring1(word.substring(i, j))) {
                    ans += n - j + 1;
                    break;
                }
            }
        }
        return ans;
    }

    private static boolean isVowelSubstring1(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == vowels[j]) {
                    freq[j]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (freq[i] != 0) {
                return true;
            }
        }
        return false;
    }

// Runtime: O(n * m)

    public static int countVowelSubstrings2(String word) {
        
        int ans = 0, n = word.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isVowelSubstring2(word.substring(i, j))) {
                    ans += n - j + 1;
                    break;
                }
            }
        }
        return ans;
    }

    private static boolean isVowelSubstring2(String str) {
        if (str.indexOf("a") == -1) {
            return false;
        }
        if (str.indexOf("e") == -1) {
            return false;
        }
        if (str.indexOf("i") == -1) {
            return false;
        }
        if (str.indexOf("o") == -1) {
            return false;
        }
        if (str.indexOf("u") == -1) {
                return false;
            }
        }
        return true;
    }

// Runtime: O(n * m)

    public static int countVowelSubstrings3(String word) {
        
        int i = 0, n = word.length();
        BigInteger ans = BigInteger.valueOf(0), b = BigInteger.valueOf(n);
        while (i < n) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
                i++;
                continue;
            }
            int j = i + 1;
            while (true) {
                if (j == n) {
                    ans = ans.add(b.subtract(BigInteger.valueOf(j)).add(BigInteger.valueOf(1)));
                    i++;
                    break;
                }
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                    j++;
                    continue;
                }
                ans = ans.add(b.subtract(BigInteger.valueOf(j)).add(BigInteger.valueOf(1)));
                i++;
                break;
            }
        }
        return ans.intValue();
    }

// Runtime: O(n * m)

    public static int countVowelSubstrings4(String word) {
        
        int ans = 0, n = word.length();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (true) {
                if (j == n) {
                    ans += n - j + 1;
                    break;
                }
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                    j++;
                    continue;
                }
                ans += n - j + 1;
                break;
            }
        }
        return ans;
    }
}