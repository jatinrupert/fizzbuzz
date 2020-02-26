package com.fizzbuzz.engine;

public class DivisibleOrContainsFiveBuzzRule implements Rule {

    private Rule followingRule;

    DivisibleOrContainsFiveBuzzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return value % 5 == 0 || Integer.toString(value).indexOf("5") != -1? "Buzz" : followingRule.apply(value);
    }
}
