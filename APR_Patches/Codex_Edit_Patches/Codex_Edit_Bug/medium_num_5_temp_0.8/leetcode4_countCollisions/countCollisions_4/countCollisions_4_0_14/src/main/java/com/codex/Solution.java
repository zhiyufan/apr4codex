package com.codex;

import java.util.*;

public class Solution {
import java.util.Comparator;

class Sorting implements Comparator<Data> {
 
    public int compare(Data a, Data b) {
        if (a.getValue() == b.getValue()) {
            return 0;
        }
        return a.getValue() > b.getValue() ? -1 : 1;
    }

 
}
}