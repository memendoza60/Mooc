
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();
        try(Scanner file = new Scanner(Paths.get(input))){
            while (file.hasNext()) {
                String next = file.nextLine();
                System.out.println(next);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
