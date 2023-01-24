package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        assertTrue(areOccurrencesEqual("abacbc"));
    }

    @Test(timeout=500)
    public void test2(){
        assertFalse(areOccurrencesEqual("aaabb"));
    }
}