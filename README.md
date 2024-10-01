# PerimeterOfParallelogram

Explanation Line by Line:
Class Declaration:

java

    public class ParallelogramPerimeter {
This line declares a public class named ParallelogramPerimeter. The class is public, meaning it can be accessed from outside the package.

Method to Calculate Perimeter:

java

    public static double calculatePerimeter(double sideA, double sideB) {
This line declares a public static method named calculatePerimeter. The method is public, so it can be accessed from outside the class. It is static, meaning it belongs to the class itself rather than an instance of the class. The method returns a double value and takes two parameters: sideA and sideB, both of type double.

Perimeter Calculation:

java

    return 2 * (sideA + sideB);
This line calculates the perimeter of the parallelogram using the formula 
2(a + b)


2(a+b). It adds sideA and sideB, multiplies the result by 2, and returns the computed value.

End of Method:

java

}
This line marks the end of the calculatePerimeter method.

Main Method Declaration:

java

    public static void main(String[] args) {
This line starts the declaration of the main method. The main method is the entry point of any Java application. It is public, static, and returns void (nothing). It takes an array of strings (String[] args) as a parameter, which can be used to pass command-line arguments to the program.

Example Values for Sides:

java

    double sideA = 5;
    double sideB = 7;
These lines declare and initialize two variables, sideA and sideB, with values 5 and 7, respectively. These represent the lengths of the two adjacent sides of the parallelogram.

    Perimeter Calculation Call:

java

double perimeter = calculatePerimeter(sideA, sideB);
This line calls the calculatePerimeter method with sideA and sideB as arguments and stores the returned value in a variable named perimeter.

Print the Result:

java

    System.out.println("The perimeter of the parallelogram is: " + perimeter + " units");
This line prints the result to the console. It uses System.out.println to output a string that includes the calculated perimeter. The + operator is used to concatenate the string with the value of perimeter.

End of Main Method:

java

}
This line marks the end of the main method.

End of Class:

java

}
This line marks the end of the ParallelogramPerimeter class.

Summary:
The class ParallelogramPerimeter contains two methods: calculatePerimeter and main.

The calculatePerimeter method computes the perimeter of a parallelogram given the lengths of its two adjacent sides.

The main method initializes the side lengths, calls calculatePerimeter to compute the perimeter, and prints the result to the console.

