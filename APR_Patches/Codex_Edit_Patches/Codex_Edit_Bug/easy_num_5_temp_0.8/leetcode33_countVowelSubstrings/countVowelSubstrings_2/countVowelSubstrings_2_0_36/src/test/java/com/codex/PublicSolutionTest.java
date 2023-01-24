package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String str = "aeiouu";
        assertEquals(2, countVowelSubstrings(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "unicornarihan";
        assertEquals(0, countVowelSubstrings(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "cuaieuouac";
        assertEquals(7, countVowelSubstrings(str));
    }

}