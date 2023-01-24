package com.codex;

import java.util.*;

public class Solution {
function countCollisions(directions) {

    var total = 0;
    var dirs = directions.split('');
    for (var i = 0; i < dirs.length; i++) {
        for (var j = i+1; j < dirs.length; j++) {
            if (dirs[i] == dirs[j]) {
                break;
            } else {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    total += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else {
                    total += 1;
                    if (dirs[i] != 'S') {
                        dirs[i] = 'S';
                    } else {
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                }
                break;
            }
        }
    }

    return total;

        return totalCollision;
    }
}