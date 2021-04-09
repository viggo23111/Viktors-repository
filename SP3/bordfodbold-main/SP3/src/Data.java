import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Data {

    public static void saveData(Tournament tournament, Founder founder, ArrayList<Team> teams) {
        //FileWriter writer = null;
        try {
            if (tournament != null) {
                FileWriter tournamentWriter = new FileWriter("tournamentData.txt");
                tournamentWriter.write(getTournamentData(tournament));
                tournamentWriter.close();
                System.out.println("Saved Tournament data!");
            }
            if (founder != null) {
                FileWriter founderWriter = new FileWriter("founderData.txt");
                founderWriter.write(getFounderData(founder));
                founderWriter.close();
                System.out.println("Saved Tournament Founder data!");
            }
            if (teams != null) {
                FileWriter teamsWriter = new FileWriter("teams.txt");
                teamsWriter.write(getTeamData(teams));
                teamsWriter.close();
                System.out.println("Saved Teams data!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while trying to save data!");
            e.printStackTrace();
        }
    }

    public static String getTournamentData(Tournament tournament) {
        StringBuilder tData = new StringBuilder();

        String currentTournament = String.format("%s:%d:%d:%d:%d:%s:%d\n",
                tournament.getTournamentName(),
                tournament.getTournamentStartTime(),
                tournament.getTournamentStartDayOfMonth(),
                tournament.getTournamentEndDayOfMonth(),
                tournament.getTournamentYear(),
                tournament.getTournamentDueDate(),
                tournament.getAmountOfTeams());

        tData.append(currentTournament);
        return tData.toString();
    }

    public static String getFounderData(Founder founder) {
        String str = "null";
        return str;
    }

    public static String getTeamData(ArrayList<Team> teams) {
        StringBuilder tData = new StringBuilder();
        for (Team t : teams) {
            String teamData = String.format("%s:%s:%d:%d:%d:%d:%b\n",
                    t.getName(),
                    t.getPoints(),
                    t.getPointscore(),
                    t.getGamesWon(),
                    t.getGamesPlayed(),
                    t.getTeamKnockedOut());
            tData.append(teamData);
        }
        return tData.toString();
    }
}
