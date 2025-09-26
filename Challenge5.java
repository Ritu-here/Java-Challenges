//Create a program to input name & respond with thw Welcome name to our college
import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HELLO!!  Enter your name");
        String name = input.next();
        System.out.println("Welcome" + name + " to our college");
    }
}
