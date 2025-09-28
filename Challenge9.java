//Create a program to Calculate product of two floating point numbers
import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        System.out.println("Calculate product of two Floating Point Number");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Floating Point Number");
        float num1 = input.nextFloat();
        System.out.println("Enter your Second Floating Point Number");
        float num2 = input.nextFloat();
        float result = num1*num2;
        System.out.println("The product of two floating point number is: " + result);

    }
}
