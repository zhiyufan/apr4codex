package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertTrue(winnerOfGame("AAABABB"));
    }

    @Test(timeout=500)
    public void test2(){
        assertFalse(winnerOfGame("AA"));
    }

    @Test(timeout=500)
    public void test3(){
        assertFalse(winnerOfGame("ABBBBBBBAAA"));
    }
}