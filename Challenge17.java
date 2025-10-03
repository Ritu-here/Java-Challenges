//Create a program to determine the greatest of the three number

import java.util.Scanner;
public class Challenge17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number and check which one is the greatest one");
        System.out.println("Enter your First number");
        int First = input.nextInt();
        System.out.println("Enter your Second number");
        int Second = input.nextInt();
        System.out.println("Enter your Third number");
        int Third = input.nextInt();
        System.out.println("Your Numbers are : " + First + "," +  Second  + " and " + Third);
        if(First > Second & First > Third){
            System.out.println( First + "is the greatest ");
        } else if (Second>First & Second > Third) {
            System.out.println(Second + " is the greatest");

        }
        else {
            System.out.println(Third + " is the greatest");
        }
    }
}
