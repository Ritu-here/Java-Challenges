//Create a program that shows bitwise compliment of a number


import java.util.Scanner;

public class Challenge24 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to showcase of NOT/Compliment Operator");
            System.out.println("Enter your number");
            int num = input.nextInt();
            int result = ~(num);
            System.out.println(result);

        }
    }


