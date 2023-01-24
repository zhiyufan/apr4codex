package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

public class SortStudent {

    public static void main(String[] args) {
        Student s1 = new Student("kushagra", 1);
        Student s2 = new Student("Aniket", 2);
        Student s3 = new Student("shubham", 3);
        Student s4 = new Student("Aryan", 4);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // Collections.sort(list, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return o1.name.compareTo(o2.name);
        // }

        // });

        System.out.println("==========================================================");
        list.stream().forEach(s -> System.out.println(s.name + " " + s.id));
        System.out.println("==========================================================");

        Collections.sort(list, (o1, o2) -> {
            String name1 = o1.name;
            String name2 = o2.name;
            int val = name1.compareTo(name2);
            if (val == 0) return o1.id - o2.id;
            return val;
        });

        System.out.println("==========================================================");
        list.stream().forEach(s -> System.out.println(s.name + " " + s.id));
        System.out.println("==========================================================");

        Collections.sort(list, (o1, o2) -> {
            int name1 = o1.id;
            int name2 = o2.id;
            return name1 - name2;
        });

        System.out.println("==========================================================");
        list.stream().forEach(s -> System.out.println(s.name + " " + s.id));
        System.out.println("==========================================================");

    }

    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }


}
}