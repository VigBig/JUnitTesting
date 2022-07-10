package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaysOfWeekTest {

    @Test
    public void testDayOfWeek_27thOct1995() {
        String actual = DaysOfWeek.dayOfWeek(27,10,1995);
        assertEquals("Friday",actual);
    }

    @Test
    public void testDayOfWeek_25thJan2001() {
        String actual = DaysOfWeek.dayOfWeek(25,1,2001);
        assertEquals("Thursday",actual);
    }

    @Test
    public void testDayOfWeek_26thJul1969() {
        String actual = DaysOfWeek.dayOfWeek(26,7,1969);
        assertEquals("Saturday",actual);
    }

    @Test
    public void testDayOfWeek_15thAug1947() {
        String actual = DaysOfWeek.dayOfWeek(15,8,1947);
        assertEquals("Friday",actual);
    }
}