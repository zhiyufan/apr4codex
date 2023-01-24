package com.codex;

import java.util.*;

public class Solution {
var fibonacci = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34];

for (var i = 0; i < fibonacci.length; i++) {
    // create a new array that contains the elements that are
    // part of the Fibonacci sequence up to, but not including, the number 13
    var fibo = [];
    if (fibonacci[i] <= 13) {
        fibo = fibonacci.slice(0,i+1);
    }

    
}