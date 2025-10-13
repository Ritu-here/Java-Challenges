//Create a program that shows bitwise OR of two numbers

import java.util.Scanner;
public class Challenge22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate bitwise OR of two numbers");
        System.out.println("Enter your first number");
        int first = in.nextInt();
        System.out.println("Enter your second number");
        int second = in.nextInt();
        int result = first | second ;
        System.out.println("The result of two bitwise OR operation is : " + result);
    }
}

