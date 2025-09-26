//Create a program to add two numbers


import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate sum of two numbers");
        System.out.println("Enter your First Number");
        int num1 = input.nextInt();
        System.out.println("Enter your Second Number");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of given numbers are : " + sum);



    }
}
