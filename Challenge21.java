//Create a program that shows bitwise AND of two numbers

import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND of two numbers");
        System.out.println("Enter your First number");
        int First = in.nextInt();
        System.out.println("Enter your second number");
        int Second = in.nextInt();

        int result = First & Second;
        System.out.println("The Bitwise AND operation gives " + result);
    }
}
