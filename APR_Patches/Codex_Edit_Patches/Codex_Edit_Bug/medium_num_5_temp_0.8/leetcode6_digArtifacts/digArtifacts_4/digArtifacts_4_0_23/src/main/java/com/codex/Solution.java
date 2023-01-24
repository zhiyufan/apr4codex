package com.codex;

import java.util.*;

public class Solution {
function digArtifacts(n, artifacts, dig) {
    // WRITE YOUR CODE HERE
    if (dig.length === 0) return artifacts.length;
    let artifactsArr = artifacts.map(val => val.join('-'));
    let digSet = new Set(dig.map(val => val.join('-')));
    for (let i = 0; i < artifacts.length; i++) {
        let artifact = artifacts[i];
        let col1 = artifact[1], col2 = artifact[3];
        let row1 = artifact[0], row2 = artifact[2];
        if (!isCovered(row1, col1, digSet) || !isCovered(row2, col2, digSet)) {
            artifactsArr.splice(i, 1);
            i--;
        }
    }

    return artifactsArr.length;
}
function isCovered(i, j, digSet) {
    if (digSet.has(`${i}-${j}`)) return true;
    return false;
}
}