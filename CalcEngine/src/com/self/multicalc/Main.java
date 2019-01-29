/* The codes are used to practice calculation of multiple (list) of variables
 *
 * Created by Shen Ren, 29/1/19 1:57 PM
 */

package com.self.multicalc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MultiVariableReader reader = new MultiVariableReader();
        List<Double> variables = reader.getVariables();
        List<String> calOptions = reader.getCalOption();

        MultiCalculator calculator = new MultiCalculator();
        double results = calculator.getMultiResult(variables, calOptions);

        System.out.println(variables);
        System.out.println(calOptions);
        System.out.printf("Results = %f", results);
    }
}
