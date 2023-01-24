package com.codex;

import java.util.*;

public class Solution {
/*
Fix the bug in this code snippet please
*/

package main

import "fmt"

func swap(a, b int) (int, int) {
	return b, a
}

func main() {
	x := 1
	y := 2

	x, y = swap(x, y)

	fmt.Println("x:", x, "y:", y)
}

/*
for x, y = swap(x, y)

The assignment operation has lower precedence than the comma operator.

This program is parsed like this:

x, (y = swap(x, y))
*/

// fix

package main

import "fmt"

func swap(a, b int) (int, int) {
	return b, a
}

func main() {
	x := 1
	y := 2

	x, y = swap(x, y)

	fmt.Println("x:", x, "y:", y)
}

//Another fix

package main

import "fmt"

func swap(a, b int) (int, int) {
	return b, a
}

func main() {
	x := 1
	y := 2

	x, y = swap(x, y)

	fmt.Println("x:", x, "y:", y)
}

/*
for _, y := swap(x, y)

swap() will return two values.

The blank identifier will be used to discard the first returned value,

which is the original value of y.

This code will work as expected.
*/

//discuss

/*
x, y = swap(x, y)

The assignment operation has lower precedence than the comma operator.

This program is parsed like this:

x, (y = swap(x, y))
*/

// another_discuss

/*
x, y = swap(x, y)

The assignment operation has lower precedence than the comma operator.

This program is parsed like this:

x, (y = swap(x, y))
*/

// last_discuss

/*
x, y = swap(x, y)

The assignment operation has lower precedence than the comma operator.

This program is parsed like this:

x, (y = swap(x, y))
*/

// elegant_version

func swap(a, b int) (int, int) {
	return b, a
}

func main() {
	x := 1
	y := 2

	x, y = y, x

	fmt.Println("x:", x, "y:", y)
    }

/*
The swap function is unnecessary.

The x, y = y, x syntax does the swap for us.

This is a common idiom in Go programs.

This program will output x: 2 y: 1
*/
}