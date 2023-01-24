package com.codex;

import java.util.*;

public class Solution {
public Map<String, Integer> getCount(List<String> list) {
        return list.stream().collect(Collectors.toMap(Function.identity(), value -> Collections.frequency(list, value)));
    }
}