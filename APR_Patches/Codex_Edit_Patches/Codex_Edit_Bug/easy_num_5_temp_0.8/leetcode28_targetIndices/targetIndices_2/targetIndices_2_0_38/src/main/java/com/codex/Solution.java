package com.codex;

import java.util.*;

public class Solution {
    public static int getElementIndex(Element element) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.data.equals(element)) return index;
            index++;
            current = current.next;
        }
        return -1;
    }   
}