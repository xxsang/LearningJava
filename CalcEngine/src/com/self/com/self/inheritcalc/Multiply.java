/*
 * Created by Shen Ren, 30/1/19 3:04 PM
 */

package com.self.com.self.inheritcalc;

public class Multiply extends BaseCalculator{
    public Multiply(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void calculate() {
        setResult(getVal1() * getVal2());
    }
}
