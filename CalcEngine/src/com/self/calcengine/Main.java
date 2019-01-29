/* The codes are used to build an simple app for calculation of 2 variables.
 *
 * Created by Shen Ren, 28/1/19 5:30 PM
 */

package com.self.calcengine;

public class Main {

    public static void main(String[] args) {

        ReadVariables variables = new ReadVariables();
        double val1 = variables.getVal1();
        double val2 = variables.getVal2();
        String calOption = variables.getCalOption();

        Calculator calc = new Calculator();
        double result = calc.getResult(val1, val2, calOption);

        System.out.printf("Result = %f", result);
    }


}
