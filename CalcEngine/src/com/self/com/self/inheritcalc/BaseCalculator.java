/*
 * Created by Shen Ren, 30/1/19 2:27 PM
 */

package com.self.com.self.inheritcalc;

public abstract class BaseCalculator {
    private double val1, val2, result;

    public BaseCalculator(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    //set variables and result
    public void setVal1(double val1) {this.val1=val1;}
    public void setVal2(double val2) {this.val2=val2;}
    public void setResult(double result) {this.result = result;}

    //get variables and result
    public double getVal1() {return this.val1;}
    public double getVal2() {return this.val2;}
    public double getResult() {return this.result;}

    //add, substract, multiply, divide
    public abstract void calculate();
}
