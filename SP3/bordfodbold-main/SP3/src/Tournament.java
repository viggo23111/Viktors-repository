import java.util.*;

public class Tournament {
    private String tournamentName;
    private int tournamentStartTime;
    private int tournamentStartDayOfMonth;
    private int tournamentEndDayOfMonth;
    private int tournamentMonth;
    private int tournamentYear;
    private String tournamentDueDate;       // the last date a team can sign up for tournament
    private int amountOfTeams;

    public Tournament(String tournamentName, int tournamentStartTime, int tournamentStartDayOfMonth, int tournamentMonth,
                      int tournamentYear, String tournamentDueDate, int amountOfTeams) {
        this.tournamentName = tournamentName;
        this.tournamentStartTime = tournamentStartTime;
        this.tournamentStartDayOfMonth = tournamentStartDayOfMonth;
        this.tournamentMonth = tournamentMonth;
        this.tournamentYear = tournamentYear;
        this.tournamentDueDate = tournamentDueDate;
        this.amountOfTeams = amountOfTeams;
    }

    public String getTournamentName() {return tournamentName;}
    public int getTournamentStartTime() {return tournamentStartTime;}
    public int getTournamentStartDayOfMonth() {return tournamentStartDayOfMonth;}
    public int getTournamentEndDayOfMonth() {return tournamentEndDayOfMonth;}
    public int getTournamentMonth() {return tournamentMonth; }
    public int getTournamentYear() {return tournamentYear;}
    public String getTournamentDueDate() {return tournamentDueDate;}
    public int getAmountOfTeams() {return Main.currentTeams.size();}
    public void setAmountOfTeams(int amountOfTeams) {this.amountOfTeams = amountOfTeams;}




    public void generateMatches(ArrayList<Team> teams) {
        amountOfTeams = teams.size();

        if (amountOfTeams % 2 != 0) {
            System.out.println("Uneven amount of teams, fix yo shit");
            return;
        }
        else {
            Collections.shuffle(teams);
            System.out.println(teams);          // print randomly sorted teams and check if its random?

            int matchTime = tournamentStartTime;
            for (int i = 0; i < amountOfTeams; i += 2) {
                Team team1 = teams.get(i);
                Team team2 = teams.get(i++);

                // if tournament starts at 20:00 = there are 4 hours left in day
                // if there is a total 16 teams = 8 matches
                if (24 - tournamentStartTime <= amountOfTeams / 2) {
                    System.out.println("Tournament will run over multiple days");
                    tournamentEndDayOfMonth = tournamentStartDayOfMonth + 1;
                }
                else {
                    System.out.println("Tournament can be completed in one day");
                    tournamentEndDayOfMonth = tournamentStartDayOfMonth;
                }

                // TODO
                // save tournament data to JSON file
                // tournamentName
                // tournamentStartTime
                // tournamentStartDayOfMonth
                // tournamentEndDayOfMonth
                // tournamentMonth
                // tournamentYear

                // save team match data to JSON file
                // team1
                // team2
                // matchTime

                matchTime ++;
                // reset match time if time is greater than 24. Than calculate new time based off how many matches are left
                if (matchTime > 24) {
                    matchTime = 24 - (amountOfTeams - i);     // maybe wrong math, we will see ;)
                }
            }

            // if amount of teams == 2
            // were at the final match
        }
    }

    public void matchDone(Team winnerTeam, Team loserTeam, int winnerGoals, int loserGoals) {
        // Increase games played and games won
        winnerTeam.setGamesPlayed(winnerTeam.getGamesPlayed() + 1);
        winnerTeam.setGamesWon(winnerTeam.getGamesWon() + 1);
        loserTeam.setGamesPlayed(loserTeam.getGamesPlayed() + 1);

        // Add points to teams
        winnerTeam.setPoints(winnerTeam.getPoints() + 2);
        winnerTeam.setPointscore(winnerTeam.getPointscore() + winnerGoals - loserGoals);

        // Knock loser out of tournament
        loserTeam.teamHasBeenKnockedOut();
    }

    private void runSim() {

    }
}
