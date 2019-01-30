/*
 * Created by Shen Ren, 28/1/19 5:39 PM
 */

package com.self.calcengine;

import java.util.Scanner;

public class ReadVariables {

    private double val1;
    private double val2;
    private String calOption;

    public ReadVariables() {

        this.readFromConsole();
    }

    private void readFromConsole() {

        Scanner scanner = new Scanner(System.in);

        //prompt for val1 and val2
        System.out.print("Please enter two decimal point numbers for calculation: ");

        this.val1 = scanner.nextDouble();
        this.val2 = scanner.nextDouble();

        //prompt for calculation options
        System.out.print("Please enter calculation options " +
                "(a for +, s for subtract, m for multiply and d for divide): ");

        this.calOption = scanner.next();
    }

    public double getVal1() {return this.val1;}
    public double getVal2() {return this.val2;}
    public String getCalOption() {return this.calOption;}
}
