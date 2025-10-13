//Create a program to showcase bitwise XOR of two numbers

import java.util.Scanner;
public class Challenge23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Showcasing XOR operation ");
        System.out.println("Enter your first number");
        int first = in.nextInt();
        System.out.println("Enter your second number");
        int second = in.nextInt();
        int result = first ^ second;
        System.out.println(" The XOR of two number is : " + result);
    }
}

