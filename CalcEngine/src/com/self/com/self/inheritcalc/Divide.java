/*
 * Created by Shen Ren, 30/1/19 3:06 PM
 */

package com.self.com.self.inheritcalc;

public class Divide extends BaseCalculator {
    public Divide(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void calculate() {
        if (getVal2()!=0.0d) setResult(getVal1() / getVal2());
        else setResult(0.0d);
    }
}
