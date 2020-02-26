package com.fizzbuzz.engine;

public class DivisibleOrContainsThreeFizzRule implements Rule {

    private Rule followingRule;

    DivisibleOrContainsThreeFizzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return value % 3 == 0 || Integer.toString(value).indexOf("3") != -1? "Fizz" : followingRule.apply(value);
    }
}
