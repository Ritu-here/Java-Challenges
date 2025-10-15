//Create a program that shows use of left shift operator

import java.util.Scanner;


public class Challenge25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of NOT/Compliment Operator");
        System.out.println("Enter your number");
        int num = input.nextInt();
        int result = num << 4;
        System.out.println(result);

    }
}

