/* Read the variables.
 * Created by Shen Ren, 29/1/19 2:00 PM
 */

package com.self.multicalc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MultiVariableReader {
    //initializer
    private List<Double> readInVariables = new ArrayList<>();
    private List<String> calOptions = new ArrayList<>();

    //constructor
    MultiVariableReader() {
        Scanner scanner = new Scanner(System.in);

        //prompt for variables
        System.out.print("Please enter several decimal point numbers for calculation: ");
        while (scanner.hasNextDouble()) {
            readInVariables.add(scanner.nextDouble());
        }
        scanner.nextLine();

        //prompt for calculation options
        System.out.print("Please enter calculation options " +
                "(a for +, s for subtract, m for multiply and d for divide): ");

        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.equalsIgnoreCase("\\s")) next = scanner.next();
            if (next.equalsIgnoreCase(";")) {
                break;
            }
            calOptions.add(next);
        }
    }

    //methods
    List<Double> getVariables() {return readInVariables;}
    List<String> getCalOption() {return calOptions;}

}
