package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        assertTrue(areNumbersAscending(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "hello world 5 x 5";
        assertFalse(areNumbersAscending(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        assertFalse(areNumbersAscending(str));
    }

}