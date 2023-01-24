package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertEquals(22, nextBeautifulNumber(1));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(1333, nextBeautifulNumber(1000));
    }

    @Test(timeout=500)
    public void test3(){
        assertEquals(3133, nextBeautifulNumber(3000));
    }
}