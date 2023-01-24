package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "iiii";
        assertEquals(36, getLucky(str, 1));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "leetcode";
        assertEquals(6, getLucky(str, 2));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "zbax";
        assertEquals(8, getLucky(str, 2));
    }
}