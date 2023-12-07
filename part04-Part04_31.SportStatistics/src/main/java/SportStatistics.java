
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        boolean isHomeTeam = false;

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                if (team.equals(parts[0]) || team.equals(parts[1])) {
                    gamesPlayed++;
                    if (team.equals(parts[0])) {
                        isHomeTeam = true;
                    } else {
                        isHomeTeam = false;
                    }
                    if (isHomeTeam == true) {
                        if (homeTeamPoints > visitingTeamPoints) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                    if (isHomeTeam == false) {
                        if (visitingTeamPoints > homeTeamPoints) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                }

            }
            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("File not found.");
        }

    }

}
