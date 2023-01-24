package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
           return IntStream.of(nums).distinct().map(i -> IntStream.of(nums).filter(j -> j - i == 1).count()).sum();
       }
}