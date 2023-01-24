package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertEquals(6, countVowels("aba"));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(3, countVowels("abc"));
    }

    @Test(timeout=500)
    public void test3(){
        assertEquals(0, countVowels("ltcd"));
    }
}