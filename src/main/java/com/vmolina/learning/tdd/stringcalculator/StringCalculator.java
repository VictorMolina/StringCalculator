package com.vmolina.learning.tdd.stringcalculator;

import com.vmolina.learning.tdd.stringcalculator.operator.Operator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static final Pattern NEXT_ELEMENT = Pattern.compile("^(|\\+|\\-|\\*)(\\d+).*$");

    public static long execute(String input, long result) {
        Matcher matcher = NEXT_ELEMENT.matcher(input);
        if (matcher.matches()) {
            String op = matcher.group(1);
            String number = matcher.group(2);
            return execute(input.substring(op.length() + number.length()),
                    Operator.get(op).apply(result, Long.parseLong(number)));
        }
        return result;
    }

}
