package com.codex;

import java.util.*;

public class Solution {
/**
 * H.B 
 * @author Heriberto 
 * 
 * The string street contains the design of a street. The street is divided into sections (1 km in length) and each section can contain either an empty space ('.') or a house ('H').

There are also some houses that have a well ('W') next to them. Do not confuse the streets with houses, they are two different things. 

A house must have a well near it, that is, there should be a space between the house and the well. The well must be in the same section as the house, and there can be no more than a house and a well in a section.

There is a bucket on each well, and this is used to put out fires. If a house catches fire, the bucket on its well should be used to put out the fire.

Each bucket can be used only once. If a bucket was used to put out a fire, it should be moved to the next well. If there is no next well, it should be moved to the first well.

The buckets on the wells are moved in a cyclical manner. After a bucket is used, it should be placed on the next well.

House fires can start in any section of the street. For example, if houses in sections 2, 6 and 9 catch fire, the buckets from wells in sections 3, 7 and 10 will be used to put them out.

Given the design of the street, find the minimum number of buckets needed to put out all fires.

Example

For street = "..W...W.W......H..H...HH...H.HH..W.W.....H.HH..HHHH.....H..", the output should be
minimumBuckets(street) = 6.

There are two sections with wells, each of them has a bucket on it. The first section will have a bucket that was used on the second section, and the second section will have a bucket that was used in the first section.

For street = "HHH...HHH...HHH.H", the output should be
minimumBuckets(street) = 4.

There are no wells to the left of the first house and to the right of the last house. Therefore, we need to have at least 4 buckets: one for each well.

Input/Output

[time limit] 3000ms (java)
[input] string street

A string representing the design of the street. All characters will be either '.', 'H' or 'W'.

Constraints:
1 ≤ street.length ≤ 1000.

[output] integer

The minimum number of buckets needed to put out all fires.

 */
public class HB {

    public static int minimumBuckets(String street) {

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == 'W') {
                        if (i + 2 < streetCharArr.length) {
                            if (streetCharArr[i + 2] == '.') {
                                count++;
                            }
                        } else {
                            count++;
                        }
                    } else if (streetCharArr[i + 1] == '.') {
                        count++;
                    }

                } else {
                    if (i - 1 >= 0) {
                        if (streetCharArr[i - 1] == '.') {
                            count++;
                        }
                    } else {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    }

    public static void main(String[] args) {
        System.out.println(minimumBuckets("W.."));
    }
}
}