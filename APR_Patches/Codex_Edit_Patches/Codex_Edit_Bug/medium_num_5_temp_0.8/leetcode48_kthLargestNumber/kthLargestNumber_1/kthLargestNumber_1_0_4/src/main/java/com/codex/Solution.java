package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.JANUARY, 1, 0, 0, 0);
        Date start = cal.getTime();

        cal.set(2016, Calendar.DECEMBER, 31, 0, 0, 0);
        Date end = cal.getTime();

        Date randomDate = randomDate(start, end);

        return randomDate;

}

private static Date randomDate(Date start, Date end) {
        long offset = start.getTime();
        long endTime = end.getTime();
        long diff = endTime - offset + 1;
        Date rand = new Date(offset + (long)(Math.random() * diff));
        return rand;
}
}