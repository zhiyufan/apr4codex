package com.codex;

import java.util.*;

public class Solution {
function oddOrEven(array $a): string {
    return array_sum($a) % 2 ? "odd" : "even";
}
}