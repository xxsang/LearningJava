/* The class is created to parse input string to calculate.
 * Created by Shen Ren, 31/1/19 3:52 PM
 */

package com.self.stringcalc;

import java.util.Scanner;

public class StringReader {
    private double val1, val2;
    private String operator;

    StringReader() {
        System.out.print("Please input a simple +/-/*// equation for calculation: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] stringSegments = inputString.split(" ");
        val1 = Double.parseDouble(stringSegments[0]);
        operator = stringSegments[1];
        val2 = Double.parseDouble(stringSegments[2]);
    }

    double getVal1() {return val1;}
    double getVal2() {return val2;}
    String getOperator() {return operator;}

}
