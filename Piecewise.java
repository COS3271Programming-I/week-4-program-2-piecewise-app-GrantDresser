// Program Name: Piecewise.java
// Author: Grant Dresser
// Date: 2/13/2026

import java.util.Scanner;

public class Piecewise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for x: ");
        double x = input.nextDouble();

        double result;

        if (x < 0) {
            result = 3 * x + 7;
        }
        else if (x >= 0 && x <= 10) {
            result = x * x + 8;
        }
        else {  
            result = x * x * x - 6 * x * x;
        }

        System.out.println("f(" + x + ") = " + result);

        input.close();
    }
}
