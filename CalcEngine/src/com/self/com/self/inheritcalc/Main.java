/* The codes are used to practice class inheritance using simple calcengine.
 * Created by Shen Ren, 30/1/19 2:22 PM
 */


package com.self.com.self.inheritcalc;
import com.self.calcengine.ReadVariables;

public class Main {
    public static void main(String[] args) {
        ReadVariables reader = new ReadVariables();
        double val1 = reader.getVal1();
        double val2 = reader.getVal2();
        //String calOption = reader.getCalOption();
        double result;

        System.out.println("Use inheritance");
        BaseCalculator[] calculators = {
                new Add(val1, val2),
                new Substract(val1, val2),
                new Multiply(val1, val2),
                new Divide(val1, val2)
        };

        for (BaseCalculator calculator:calculators) {
            calculator.calculate();
            result = calculator.getResult();
            System.out.printf("Results = %f\n", result);
        }
    }
}
