package launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven: ");
        double miles = input.nextDouble();

        System.out.println("Enter the number of gallons of gas consumed: ");
        double gallons = input.nextDouble();

        input.close();

        double mpg = miles / gallons;
        System.out.println("Your mpg is: " + mpg);
    }
}
