package com.bridgelabz.junittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperatureConversionTest {

    @Test
    public void testTemperatureConversion_100Celsius() {
        double actual = TemperatureConversion.temperatureConversion(100.0,1);
        assertEquals(212.0,actual,0);
    }

    @Test
    public void testTemperatureConversion_0Celsius() {
        double actual = TemperatureConversion.temperatureConversion(0.0,1);
        assertEquals(32.0,actual,0);
    }

    @Test
    public void testTemperatureConversion_212Fahrenheit() {
        double actual = TemperatureConversion.temperatureConversion(212,2);
        assertEquals(100,actual,0);
    }

    @Test
    public void testTemperatureConversion_32Fahrenheit() {
        double actual = TemperatureConversion.temperatureConversion(32,2);
        assertEquals(0,actual,0);
    }

    @Test
    public void testTemperatureConversion_50Celsius() {
        double actual = TemperatureConversion.temperatureConversion(50,1);
        assertEquals(122,actual,0);
    }

    @Test
    public void testTemperatureConversion_0Fahrenheit() {
        double actual = TemperatureConversion.temperatureConversion(0,2);
        assertEquals(-17.778,actual,0.00077777777);
    }

    @Test
    public void testTemperatureConversion_32Celsius() {
        double actual = TemperatureConversion.temperatureConversion(32,1);
        assertEquals(89.6,actual,0);
    }
}