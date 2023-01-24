package com.codex;

import java.util.*;

public class Solution {
public string GetReverseString(string input)
{
    if(string.IsNullOrEmpty(input))
    {
        throw new ArgumentException("Input string is null or empty");
    }

    StringBuilder reverseString = new StringBuilder();
    for (int i = input.Length - 1; i >= 0; i--)
    {
        reverseString.Append(input[i]);
    }
    return reverseString.ToString();
}
}