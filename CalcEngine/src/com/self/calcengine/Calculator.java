/*
 * Created by Shen Ren, 28/1/19 5:30 PM
 */


package com.self.calcengine;

public class Calculator {

    public Calculator() {}

    public double getResult(double val1, double val2, String calOption) {

        //do calculation
        double result;

        switch (calOption) {
            case "a":
                result = val1 + val2;
                break;
            case "s":
                result = val1 - val2;
                break;
            case "m":
                result = val1 * val2;
                break;
            case "d":
                result = val2 != 0.0 ? val1 / val2 : 0.0;
                break;
            default:
                result = 0.0f;
                break;
        }
        return result;
    }

}
