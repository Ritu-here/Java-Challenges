//Create a program to convert Fahrenheit to celsius

import java.util.Scanner;
public class Challenge14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert your Fahrenheit value to celsius ");
        System.out.println("Enter your Fahrenheit value");
        int F = input.nextInt();
        float C = (F-32)* 5/9;
        System.out.println("Your Celsius value is " + C);
    }
}
