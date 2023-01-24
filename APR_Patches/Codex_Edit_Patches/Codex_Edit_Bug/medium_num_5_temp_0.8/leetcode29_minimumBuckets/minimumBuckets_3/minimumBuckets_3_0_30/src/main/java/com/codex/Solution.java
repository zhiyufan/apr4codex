package com.codex;

import java.util.*;

public class Solution {
    // N3
    public static int minimumBuckets(String street) {
        

        int end = 0;
        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }

        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }

        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }

        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        for (int i = end; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (streetCharArr[i + 1] == '.') {
                    streetCharArr[i + 1] = 'B';
                    count++;
                    end = i + 1;
                }
            }
        }
        
    }
}