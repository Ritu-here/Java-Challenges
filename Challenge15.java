//Create a program that determines if a number is positive , negative or Zero

import java.util.Scanner;
public class Challenge15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check here your number is positive , negative or Zero");
        System.out.println("Enter your Number ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Your number is Positive");
        } else if (num < 0) {
            System.out.println("Your number is negative");

        }
        else{
            System.out.println("Your number is Zero");
        }


    }
}
