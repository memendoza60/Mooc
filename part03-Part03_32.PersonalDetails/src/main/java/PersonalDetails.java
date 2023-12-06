
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        String longest = "";
        int count = 0;
        int sum = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] array = input.split(",");
            int number = array[0].length();
            int year = Integer.valueOf(array[1]);
            if(longest.length() < number){
                longest = array[0];
            }
            sum += year;
            count++;
        }
        System.out.println("Longest name: " + longest);
        average = (double) sum / count;
        System.out.println("Average of the birth years: " + average);
    }
}
