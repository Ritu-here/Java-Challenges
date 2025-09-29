//Create a program to calculate simple interest . Simple interest = (P*R*T)/100

import java.sql.SQLOutput;
import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Simple Interest: ");
        System.out.println("Enter the value of P or Principal");
        int P = input.nextInt();
        System.out.println("Enter the value of R or Rate");
        int R = input.nextInt();
        System.out.println("Enter the valur of T or Time");
        int T = input.nextInt();

        float SI = (P*R*T)/100;

        System.out.println("The Simple Interest of the given value is " + SI);

    }
}
