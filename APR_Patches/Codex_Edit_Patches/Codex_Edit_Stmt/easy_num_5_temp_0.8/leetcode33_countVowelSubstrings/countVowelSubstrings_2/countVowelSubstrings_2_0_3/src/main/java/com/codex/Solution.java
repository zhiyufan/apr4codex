package com.codex;

import java.util.*;

public class Solution {
<details>
    <summary>One</summary>
    <details>
        <summary>One.One</summary>
        <details>
            <summary>One.One.One</summary>
            <p>One.One.One</p>
        </details>
        <details>
            <summary>One.One.Two</summary>
            <p>One.One.Two</p>
        </details>
        <details>
            <summary>One.One.Three</summary>
            <p>One.One.Three</p>
        </details>
    </details>
    <details>
        <summary>One.Two</summary>
        <details>
            <summary>One.Two.One</summary>
            <p>One.Two.One</p>
        </details>
        <details>
            <summary>One.Two.Two</summary>
            <p>One.Two.Two</p>
        </details>
        <details>
            <summary>One.Two.Three</summary>
            <p>One.Two.Three</p>
        </details>
    </details>
    <details>
        <summary>One.Three</summary>
        <details>
            <summary>One.Three.One</summary>
            <p>One.Three.One</p>
        </details>
        <details>
            <summary>One.Three.Two</summary>
            <p>One.Three.Two</p>
        </details>
        <details>
            <summary>One.Three.Three</summary>
            <p>One.Three.Three</p>
        </details>
    </details>
</details>
<details>
    <summary>Two</summary>
    <p>Two</p>
</details>
<details>
    <summary>Three</summary>
    <details>
        <summary>Three.One</summary>
        <p>Three.One</p>
    </details>
    <details>
        <summary>Three.Two</summary>
        <p>Three.Two</p>
    </details>
    <details>
        <summary>Three.Three</summary>
        <p>Three.Three</p>
    </details>
</details>
<details>
    <summary>Four</summary>
    <details>
        <summary>Four.One</summary>
        <details>
            <summary>Four.One.One</summary>
            <p>Four.One.One</p>
        </details>
        <details>
            <summary>Four.One.Two</summary>
    public static int countVowelSubstrings(String word) {
        ans = 0
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (isVowelSubstring(word.substring(i, j + 1))) {
                    ans++
                }
            }
        }
        return ans
    }

    private static boolean isVowelSubstring(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}
        int[] freq = new int[5]
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == vowels[j]) {
                    freq[j]++
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false
            }
        }
        return true
    }
        </p>
    </details>
    <details>
        <summary>Four.Two</summary>
        <p>Four.Two</p>
    </details>
    <details>
        <summary>Four.Three</summary>
        <p>Four.Three</p>
    </details>
</details>
}