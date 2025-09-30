//Create a program to calculate compound Interest. CP=P(1+R/100)*T

import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate compound interest ");
        System.out.println("Enter the value of P or Principal");
        int P = input.nextInt();
        System.out.println("Enter the value  of R or Rate");
        int R = input.nextInt();
        System.out.println("Enter the value of T or Time");
        int T = input.nextInt();
        float CI = P*(1+R/100)*T;
        System.out.println("Compound Interest is " + CI);




    }
}
