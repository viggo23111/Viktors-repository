import java.util.ArrayList;

public class Main {
    public static Data data;
    public static UI ui;
    public static Tournament currentTournament;
    public static ArrayList<Team> currentTeams = new ArrayList();

    public static void main(String[] args) {
        currentTournament = ui.welcomeMessage();

        //data.saveData(currentTournament, null, currentTeams);
    }
}
























/*
- normally 16 teams
- normally 8 matches

Team class (arraylist)
    team name
    names of players (2 players)
    points (match won = 2 points)
    pointscore (goals scored - goals other team scored) - only used if 2 teams have the same amount of points
    maybe? amount of games won
    maybe? games played


Tournament class
    Tournament name
    Tournament dates
    Tournament due date (cut off)
    Amount of teams signed up

    generateMatch()
    teamWon()
    teamLost()

    runSim()

Tournament Founder class
    showAllTeams()
    showTeamPlacements()
    showMatchDates()


txt file
    contains all of match data

    Tournament name
    Tournament dates
    Tournament due date (cut off)


 */