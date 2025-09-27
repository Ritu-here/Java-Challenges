//Create a program to SWAP two numbers
import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping");
        System.out.println("Enter your First number");
        int num1 = input.nextInt();
        System.out.println("Enter your Second number");
        int num2 = input.nextInt();
        System.out.println("Number before swapping operation" +"num1 =" + num1 +"num2 = "+ num2);
        System.out.println("Numbers After Swapping Operation");
        int s = num1;
        num1 = num2;
        num2 = s;
        System.out.println("Num1 = " + num1 + " Num2 = " + num2);

    }
}
