package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleByThreeAndFiveFizzBuzzRuleTest {

    @Test
    public void assertPositiveCase() {
        assertEquals("FizzBuzz", new DivisibleByThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(15));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("3", new DivisibleByThreeAndFiveFizzBuzzRule(new DefaultValueRule()).apply(3));
    }

}
