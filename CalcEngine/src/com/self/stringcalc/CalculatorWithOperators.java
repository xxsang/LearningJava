/*
 * Created by Shen Ren, 31/1/19 4:04 PM
 */

package com.self.stringcalc;

public class CalculatorWithOperators {
    CalculatorWithOperators() {}

    public double getResult(double val1, double val2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                if (val2!=0.0) result = val1 / val2;
                else result = 0.0d;
                break;
            default:
                result = 0.0d;
                break;
        }
        return result;
    }
}
