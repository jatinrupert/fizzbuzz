package com.fizzbuzz.engine;

public class DivisibleAndContainsThreeAndFiveFizzBuzzRule implements Rule {

    private Rule followingRule;

    DivisibleAndContainsThreeAndFiveFizzBuzzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return (value % 5 == 0 || Integer.toString(value).indexOf("5") != -1)  && (value % 3 == 0 || Integer.toString(value).indexOf("3") != -1) ? "FizzBuzz" : followingRule.apply(value);
    }
}
