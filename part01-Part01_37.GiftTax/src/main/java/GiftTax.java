
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double number = Double.valueOf(scan.nextLine());
        if (number < 5000) {
            System.out.println("No tax!");
        } else if (number >= 5000 && number <= 25000) {
            number = 100 + (number - 5000) * .08;
            System.out.println("Tax: " + number);
        } else if (number >= 25000 && number <= 55000) {
            number = 1700 + (number - 25000) * .10;
            System.out.println("Tax: " + number);
        } else if (number >= 55000 && number <= 200000) {
            number = 4700 + (number - 55000) * .12;
            System.out.println("Tax: " + number);
        } else if (number >= 200000 && number <= 1000000) {
            number = 22100 + (number - 200000) * .15;
            System.out.println("Tax: " + number);
        } else if (number >= 1000000) {
            number = 142100 + (number - 1000000) * .17;
            System.out.println("Tax: " + number);
        }

    }
}
