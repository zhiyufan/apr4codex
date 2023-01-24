package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int MinAddToMakeValid(string S) {
        var stack = new Stack<char>();
        for(int i = 0; i < S.Length; i++) {
            if (S[i] == '(') stack.Push(S[i]);
            else {
                if (stack.Count > 0 && stack.Peek() == '(') stack.Pop();
                else stack.Push(S[i]);
            }
        }
        return stack.Count;
    }

}
}