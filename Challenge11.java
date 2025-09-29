// Create a program to calculate the area of triangle .Area of Triangle is 1/2 *B*H


import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the area of triangle");
        System.out.println("Enter the Height of the triangle");
        int H = input.nextInt();
        System.out.println("Enter the Breadth of triangle");
        int B = input.nextInt();
        float area = (H*B)/2;
        System.out.println("The Area of triangle is " + area);
    }
}
