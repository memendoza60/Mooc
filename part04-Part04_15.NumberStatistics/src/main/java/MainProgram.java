
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics stats = new Statistics();
        Statistics stats2 = new Statistics();
        Statistics stats3 = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {  
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            stats.addNumber(input);
            if (input % 2 == 0) {
                stats2.addNumber(input);
            } else{
                stats3.addNumber(input);
            }
            
            
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + stats2.sum());
        System.out.println("Sum of odd numbers: " + stats3.sum());
        
    }
}