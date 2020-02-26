package com.fizzbuzz.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzRuleService {

    private List<Integer> numericValues;

    public FizzBuzzRuleService(int start, int end) {
        numericValues = IntStream.range(start, end + 1).boxed().collect(Collectors.toList());
    }

    public FizzBuzzRuleService() {
        this(1, 100);
    }

    public List<String> getValues(RuleDecider ruleDecider) {
        return numericValues.stream().map(x -> ruleDecider.getRule().apply(x)).collect(Collectors.toList());
    }
}
