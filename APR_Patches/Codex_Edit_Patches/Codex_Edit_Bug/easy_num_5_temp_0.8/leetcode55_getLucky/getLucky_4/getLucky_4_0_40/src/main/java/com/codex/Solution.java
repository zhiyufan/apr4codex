package com.codex;

import java.util.*;

public class Solution {
    int setBits = countSetBits(n); 
  
    // If count of set bits is even, 
    // then result is 0 else 1 
    return (setBits % 2) == 0 ? 0 : 1;
}