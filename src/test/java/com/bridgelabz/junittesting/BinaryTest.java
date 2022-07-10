package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test
    public void testToBinary106() {
        String actual = Binary.toBinary(106);
        assertEquals("1101010",actual);
    }

    @Test
    public void testToBinary10() {
        String actual = Binary.toBinary(10);
        assertEquals("1010",actual);
    }

    @Test
    public void testToBinary38() {
        String actual = Binary.toBinary(38);
        assertEquals("100110",actual);
    }
}