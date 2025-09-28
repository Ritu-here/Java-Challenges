//Create a program to calculate the perimeter of rectangle.Perimeter of rectangle ABCD = A+B+C+D    'import java.util.Scanner;

import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args) {
        System.out.println("Calculate Perimeter of a Rectangle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of first side of the  rectangle ");
        int A = input.nextInt();
        System.out.println("Enter the value of second side of the rectangle");
        int B = input.nextInt();
        System.out.println("Enter the value of third side of the rectangle");
        int C = input.nextInt();
        System.out.println("Enter the value of fourth side of the rectangle");
        int D = input.nextInt();
        float ABCD = A+B+C+D;
        System.out.println("The perimeter of rectangle is " + ABCD);
    }
}
