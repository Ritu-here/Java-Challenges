//Create a program to take two no & show result of all arithmetic operator



import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        System.out.println("All Arithmetic Operators use");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a = input.nextInt();
        System.out.println("Enter your Second Number");
        int b = input.nextInt();
        System.out.println("Here is the result of the all Arithmetic operation performed on the given input");
        System.out.println("Addition of a and b :" + (a + b) );
        System.out.println("Subtraction of a and b :" + (a-b));
        System.out.println("Multiplication of a and b:" + (a*b));
        System.out.println("Division of a and b:" + (a/b));
        System.out.println("Modulus of a and b:" + (a%b));


    }
}
