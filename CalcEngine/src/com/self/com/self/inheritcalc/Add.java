/*
 * Created by Shen Ren, 30/1/19 2:48 PM
 */

package com.self.com.self.inheritcalc;

public class Add extends BaseCalculator {

    public Add(double val1, double val2) {
        super(val1, val2);
    }

    //override calculator from BaseCalculator
    @Override
    public void calculate() {
        setResult(getVal1() + getVal2());
    }

}
