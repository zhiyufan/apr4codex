package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "aaaa";
        String str2 = "bccb";
        assertFalse(checkAlmostEquivalent(str, str2));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "abcdeef";
        String str2 = "abaaacc";
        assertFalse(checkAlmostEquivalent(str, str2));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "cccddabba";
        String str2 = "babababab";
        assertFalse(checkAlmostEquivalent(str, str2));
    }

}