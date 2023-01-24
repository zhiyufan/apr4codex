package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        assertEquals("Capitalize The Title", capitalizeTitle("capiTalIze tHe titLe"));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals("First Letter of Each Word", capitalizeTitle("First leTTeR of EACH Word"));
    }

    @Test(timeout=500)
    public void test3(){
        assertEquals("i Love Leetcode", capitalizeTitle("i lOve leetcode"));
    }

}