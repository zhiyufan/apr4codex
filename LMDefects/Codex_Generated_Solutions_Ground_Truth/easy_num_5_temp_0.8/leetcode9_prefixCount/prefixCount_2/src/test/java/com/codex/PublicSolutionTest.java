package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        String arr[] = {"pay", "attention", "practice", "attend"};
        assertEquals(prefixCount(arr, "at"), 2);
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"leetcode","win","loops","success"};
        assertEquals(prefixCount(arr, "code"), 0);
    }

}