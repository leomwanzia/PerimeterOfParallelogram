package com.leo;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {

        // FIRST METHOD
        Scanner in = new Scanner(System.in);
//        //prompt user to enter diagonal 1
//        System.out.print("Enter diagonal 1: ");
//        double diagonal1 = in.nextDouble(); //reads the input in double
//
//        //prompt the user to enter diagonal 2
//        System.out.print("Enter diagonal 2: ");
//        double diagonal2 = in.nextDouble(); // reads the input in double
//
//        // Perimeter = 2 * (diagonal1 + diagonal2)

//        double perimeter = 2 * (diagonal1 + diagonal2);
//        // prints the perimeter
//        System.out.println("The perimeter of the parallelogram is: " + perimeter);

        // SECOND METHOD

        //prompt user to enter side A
        System.out.print("Enter the length of Side A: ");
        double sideA = in.nextDouble(); //reads the input in double

        // prompt to enter side B
        System.out.print("Enter the length of side B: ");
        double sideB = in.nextDouble(); // reads the input in double

        // call the calculatePerimeter method to compute the perimeter
        double perimeter = calculatePerimeter(sideA, sideB);
        // print the calculated perimeter
        System.out.println("The perimeter of the parallelogram is: " + perimeter + " units");

        in.close();
    }
    //define the calculatePerimeter
    private static double calculatePerimeter(double sideA, double sideB){
        //formula for perimeter is 2 (sideA + sideB)
        // return the calculated perimeter
        return 2 * (sideA + sideB);

    }
}
