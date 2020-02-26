package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleByFiveBuzzRuleTest {

    @Test
    public void assertPositiveCase() {
        assertEquals("Buzz", new DivisibleByFiveBuzzRule(new DefaultValueRule()).apply(5));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("3", new DivisibleByFiveBuzzRule(new DefaultValueRule()).apply(3));
    }

}
