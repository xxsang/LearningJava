/*
 * Created by Shen Ren, 31/1/19 3:51 PM
 */

package com.self.stringcalc;

public class Main {
    public static void main(String[] args) {
        double result;
        StringReader reader = new StringReader();
        CalculatorWithOperators calculator = new CalculatorWithOperators();
        result = calculator.getResult(reader.getVal1(), reader.getVal2(), reader.getOperator());
        System.out.printf("The result of calculation is %f\n", result);
    }
}
