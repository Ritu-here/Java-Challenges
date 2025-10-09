//Create a program to determine if a given year is a leap year
import java.util.Scanner;
public class Challenge18 {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Check year is normal year or leap year");
        System.out.println("Enter your year ");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;

            }
            else {
                leap = true;
            }
            }
            if(leap){
                System.out.println(year + " is a leap year ");
        }
            else{
                System.out.println(year + " is not a leap year");
            }
    }
}
