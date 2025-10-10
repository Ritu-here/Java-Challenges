//Create a program that calculates grades based on the marks
//A--> above 90 , B--> above 75 ,C--> above 60 , D--> above 30  , F --> below 30
import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks in percentage and check your grades (1-100)");
        int marks = input.nextInt();

        if(marks >= 90 & marks <= 100){
            System.out.println("You got grade A ");
        }
        else if (marks >= 75 & marks < 90) {
            System.out.println("You got grade B");

        } else if (marks >= 60 & marks < 75 ) {
            System.out.println("You got grade C");

        }
        else if (marks >= 30 & marks<60){
            System.out.println("You got grade D");
        }
        else{
            System.out.println("You got grade F");
        }


    }
}
