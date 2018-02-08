package com.vmolina.learning.tdd.stringcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void test0() {
        assertEquals(0L, StringCalculator.execute("0", 0L));
    }

    @Test
    public void testNumber() {
        assertEquals(123456L, StringCalculator.execute("123456", 0L));
    }

    @Test
    public void testAdd() {
        assertEquals(6L, StringCalculator.execute("4+2", 0L));
    }

    @Test
    public void testAddAdd() {
        assertEquals(14L, StringCalculator.execute("8+4+2", 0L));
    }

    @Test
    public void testSubSub() {
        assertEquals(2L, StringCalculator.execute("8-4-2", 0L));
    }

    @Test
    public void testMulMul() {
        assertEquals(24L, StringCalculator.execute("2*3*4", 0L));
    }

    @Test
    public void testAddSubMul() {
        assertEquals(5L, StringCalculator.execute("2+3-4*5", 0L));
    }

}
