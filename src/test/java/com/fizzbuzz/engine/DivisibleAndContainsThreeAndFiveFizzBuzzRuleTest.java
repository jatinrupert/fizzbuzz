package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleAndContainsThreeAndFiveFizzBuzzRuleTest {

    @Test
    public void assertPositiveDivisibleCase() {
        assertEquals("FizzBuzz", new DivisibleAndContainsThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(15));
    }

    @Test
    public void assertPositiveContainsCase() {
        assertEquals("FizzBuzz", new DivisibleAndContainsThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(53));
    }

    @Test
    public void assertPositiveContainsAndDivisibleCase() {
        assertEquals("FizzBuzz", new DivisibleAndContainsThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(54));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("3", new DivisibleAndContainsThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(3));
    }
}
