/* Do the calculation
 * Created by Shen Ren, 29/1/19 2:00 PM
 */

package com.self.multicalc;

import java.util.List;
import com.self.calcengine.Calculator;

class MultiCalculator {

    MultiCalculator() {}

    private double getSingleResult(double val1, double val2, String calOption) {
        Calculator calculator = new Calculator();
        return calculator.getResult(val1, val2, calOption);
    }

    double getMultiResult(List<Double> variables, List<String> calOptions) {

        double results;
        results = variables.get(0);

        for (int index=1; index<variables.size(); index++)
            results = getSingleResult(results, variables.get(index), calOptions.get(index - 1));

        return results;
    }

}

