package com.fizzbuzz.engine;

public class ThreeFiveContainsAndDivisorRule implements Rule {

    @Override
    public String apply(int value) {
        final var defaultValueRule = new DefaultValueRule();
        final var divisibleOrContainsThreeFizzRule = new DivisibleOrContainsThreeFizzRule(defaultValueRule);
        final var divisibleOrContainsFiveBuzzRule = new DivisibleOrContainsFiveBuzzRule(divisibleOrContainsThreeFizzRule);
        final var divisibleAndContainsThreeAndFiveFizzBuzzRule = new DivisibleAndContainsThreeAndFiveFizzBuzzRule(divisibleOrContainsFiveBuzzRule);
        return divisibleAndContainsThreeAndFiveFizzBuzzRule.apply(value);
    }
}
