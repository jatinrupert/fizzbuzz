package com.fizzbuzz.engine;

public class ThreeFiveDivisorRule implements Rule {

    @Override
    public String apply(int value) {
        final var defaultValueRule = new DefaultValueRule();
        final var divisibleByThreeFizzRule = new DivisibleByThreeFizzRule(defaultValueRule);
        final var divisibleByFiveBuzzRule = new DivisibleByFiveBuzzRule(divisibleByThreeFizzRule);
        final var divisibleByThreeAndFiveFizzBuzzRule = new DivisibleByThreeAndFiveFizzBuzzRule(divisibleByFiveBuzzRule);
        return divisibleByThreeAndFiveFizzBuzzRule.apply(value);
    }
}
