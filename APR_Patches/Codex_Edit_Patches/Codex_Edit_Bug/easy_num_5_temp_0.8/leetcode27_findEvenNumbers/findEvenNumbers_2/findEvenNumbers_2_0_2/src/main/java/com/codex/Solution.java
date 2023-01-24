package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add(0, "1");
        a.add(1, "2");
        a.add(2, "3");

        List<String> a2 = a.subList(3, 3);
        System.out.println(a2.size());
        for (String s : a2) {
            System.out.println(s);
        }

        if (a2.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is NOT empty");
        }

    }

}
}