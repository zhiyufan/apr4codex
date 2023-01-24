package com.codex;

import java.util.*;

public class Solution {
for (int i = 0; i < list.size(); i++) {
                answer += list.get(i) * Math.pow(10, i);
            }


for (int i = 0, i1 = 0; i < list.size(); i++, i1++) {
                answer += list.get(i) * Math.pow(10, i1);
            }


for (int i = 0, i1 = 0, i2 = 0; i < list.size(); i++, i1++, i2++) {
                answer += list.get(i) * Math.pow(10, i1);
            }


for (int i = 0, i1 = 0, i2 = 0; i < list.size(); i++, i1++, i2++) {
                answer += list.get(i1) * Math.pow(10, i2);
            }
}