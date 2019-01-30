/*
 * Created by Shen Ren, 30/1/19 3:02 PM
 */

package com.self.com.self.inheritcalc;

public class Substract extends BaseCalculator {
    public Substract(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void calculate() {
        setResult(getVal1() - getVal2());
    }

}
