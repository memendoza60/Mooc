
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int greatest = 0;
        while (true) {            
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] array = input.split(",");
            int number = Integer.valueOf(array[1]);
            if(greatest < number){
                greatest = number;
            }
        }
        System.out.println("Age of the oldest: " + greatest);

    }
}
