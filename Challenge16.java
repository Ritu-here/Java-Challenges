//Create a program that determines if a number is odd or even.

import java.util.Scanner;
public class Challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check your number is ODD or EVEN");
        System.out.println("Enter your number");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Your number is Even");
        }
    }
}
