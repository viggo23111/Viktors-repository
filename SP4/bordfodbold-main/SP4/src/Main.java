import java.io.File;
import java.sql.SQLException;
import java.time.*;
import java.util.ArrayList;

public class Main {
    //public static UIData uiData;
    public static Tournament tournament;
    // public static Match match;

    public static ArrayList<Team> teams = new ArrayList<>();
//    public static ArrayList<Team> currentTeams = new ArrayList();
//    public static ArrayList<Team> activeTeams = new ArrayList();
    public static ArrayList<Match> matches = new ArrayList();
    public static ArrayList<Match> matchesNotDone = new ArrayList();
    public static ArrayList<TeamMatches> teamMatches = new ArrayList();
    public static ArrayList<Player> players = new ArrayList();
    public static IO io;
    public static boolean useSQL = false;
//    public static ArrayList<Match> oldMatches = new ArrayList();

    public static LocalTime lastMatchTime;
    public static LocalDate lastMatchDate;

    public static void main(String[] args) throws SQLException {
        UIData.deleteDataFile(new File("matchesData.txt"));
        UIData.deleteDataFile(new File("playerData.txt"));
        UIData.deleteDataFile(new File("teamMatchesData.txt"));
        UIData.deleteDataFile(new File("teamsData.txt"));
        UIData.deleteDataFile(new File("tournamentData.txt"));

        UI.welcomeMessage();
        UI.menuMain();


        // TODO: WHEN THERES ONLY ONE TEAM THATS NOT KNOCKED OUT, PRINT NAMES OF PLAYERS ON TEAM

//        io=getIO();
//        io.saveNewTeam("testTeamSQL1");
//        io.saveNewTeam("testTeamSQL2");
//        io.saveNewTeam("testTeamSQL3");
//        io.saveNewTeam("testTeamSQL4");
//        io.savePlayer("testPlayerSQL1team1",1);
//        io.savePlayer("testPlayerSQL2team1",1);
//        io.savePlayer("testPlayerSQL1team2",2);
//        io.savePlayer("testPlayerSQL2team2",2);
//        io.savePlayer("testPlayerSQL1team3",3);
//        io.savePlayer("testPlayerSQL2team3",3);
//        io.savePlayer("testPlayerSQL1team4",4);
//        io.savePlayer("testPlayerSQL2team4",4);
//
//       // io.saveExistingTeam(3,2,4,1,1,false);
//        String startD = "2021-10-23";
//        LocalDate startDate = LocalDate.parse(startD);
//        String startT = "13:00";
//        LocalTime startTime = LocalTime.parse(startT);
//        io.saveTournament("FEDT navn","lort",startTime,startDate,startDate);
//        UIData.createMatches();
//        io.loadData("matchesData");



/*
        UIData.createMatches();
        System.out.println(matches);
        io.saveExistingTeam(1,2,2,0,1,true);
        io.saveExistingTeam(3,2,2,0,1,true);
        UIData.createMatches();
        System.out.println(matches);


        TeamMatches tm0 = teamMatches.get(0);
        TeamMatches tm1 = teamMatches.get(1);
        io.saveExistingTeamMatches(tm0.getID(),tm0.getMatchID(),tm0.getTeamID(),2);
        io.saveExistingTeamMatches(tm1.getID(),tm1.getMatchID(),tm1.getTeamID(),10);

      //  UIData.createMatches();
       // System.out.println(matches);

        Data.savePlayer("TestPlayerTXT34234",1);
        Data.savePlayer("TestPlayerTXT2234234",2);
        Data.savePlayer("TestPla24234yerTXT2234234",3);
        Data.savePlayer("TestPlay234234erTXT2234234",4);



        DBConnector.saveNewTeam("Team Lort");
        int lorteIndex = teams.get(0).getID();
        DBConnector.saveExistingTeam(lorteIndex, 5, 4, 2, 5,false);
        DBConnector.savePlayer("TestLort1",1);
        DBConnector.savePlayer("TestLort2",1);
        DBConnector.savePlayer("TestLort3",1);

        String startD = "2021-10-23";
        LocalDate startDate = LocalDate.parse(startD);
        String startT = "18:00";
        LocalTime startTime = LocalTime.parse(startT);
        DBConnector.saveTournament("TournamentName","TournamentFounder",startTime,startDate,startDate);
        DBConnector.saveMatches(startTime,startDate);
        DBConnector.saveNewTeamMatches(1,1,0);
        DBConnector.loadData("team");
*/


       // DBConnector.saveData("playerData");
       // // DBConnector.loadData("playerData");
//        UI.welcomeMessage();
//        UI.menuMain();
    }


    public static IO getIO() {
        if (useSQL) return new DBConnector();
        else return new Data();

        // use IO = Main.getIO;
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