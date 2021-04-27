import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class UI {

    // return a users input, takes a string that will be shown in terminal
    public static String getUserInput(String msg){
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void welcomeMessage() {
        // TODO: CLEAR OR DROP DATA IF USER REPLIES NO TO SECOND QUESTION
        // TODO: PUT IN LOOP TO MAKE SURE USER INPUTS CORRECT ANSWER

        System.out.println("\nWelcome to Table Football tournament manager!\n");
        String dataTypeMsg = "\nWould you like to use SQL? (y/n) ";
        String dataTypeInput = getUserInput(dataTypeMsg);

        if (dataTypeInput.equalsIgnoreCase("y")) Main.useSQL = true;
        else Main.useSQL = false;

        String loadDataMsg = "\nWould you like to load existing data? (y/n) ";
        String loadDataInput = getUserInput(loadDataMsg);

        if (loadDataInput.equalsIgnoreCase("y")) {
            Main.getIO().loadData("playerData");
            Main.getIO().loadData("teamsData");
            Main.getIO().loadData("tournamentData");
            Main.getIO().loadData("matchesData");
            Main.getIO().loadData("teamMatchesData");
        } else System.out.println("\nNo data will be loaded!\n");
    }

    // MENU FUNCTIONS
    public static void menuMain() {
        while (true) {
            String menuMainStr = "\nInput number of what you would like to do\n" +
                    "\n\t1 - Create New Tournament" +
                    "\n\t2 - Add Team" +
                    "\n\t3 - Add Player " +
                    "\n\t4 - Show Statistics" +
                    "\n\t5 - Generate Matches" +
                    "\n\t6 - Start Next Tournament Stage\n";
            String menuMainInput = getUserInput(menuMainStr);
            switch (menuMainInput) {
                case "1" -> UIData.createTournament();
                case "2" -> UIData.createTeam();
                case "3" -> UIData.createPlayer();
                case "4" -> menuTeamRankings();
                case "5" -> UIData.createMatches();
//                case "6" -> runTournament();
//                case "9" -> debugData();
                default -> System.out.println("Invalid input");
            }
        }
    }


    public static void menuTeamRankings() {
        while (true) {
            String menuTeamRankingsStr = "\nInput number of what you would like to do\n" +
                    "\n\t1 - Show All Teams" +
                    "\n\t2 - Show Team Placements / Rankings" +
                    "\n\t3 - Show All Matches" +
                    "\n\t4 - Show Next Match Time" +
                    "\n\t0 - Return To Main Menu\n";
            String menuTeamRankingsInput = getUserInput(menuTeamRankingsStr);

            switch (menuTeamRankingsInput) {
                case "1" -> showAllTeams();
                case "2" -> showTeamPlacements();
                case "3" -> showMatches();
                case "4" -> getNextMatchTime();
                case "0" -> {return;}
                default -> {
                    System.out.println("Invalid input");
                    menuTeamRankings();
                }
            }
        }
    }

    // USER FUNCTIONS
    public static void showAllTeams() {
        System.out.println("Displaying all teams");
        for (int i = 0; i < Main.teams.size(); i++) {
            int indexTeamID = Main.teams.get(i).getID();

            StringBuilder indexTeamPlayerNames = new StringBuilder();
            for (Player player : Main.players) {
                if (player.getTeamID() == indexTeamID) {
                    indexTeamPlayerNames.append(" ").append(player.getPlayerName());
                }
            }

            System.out.println("Team "+ (i+1) +": \n"+
                    "\t\tTeam ID : "+ Main.teams.get(i).getID() +
                    "\t\tTeam Name : "+ Main.teams.get(i).getName() +
                    "\t\tPlayers : "+ indexTeamPlayerNames);
        }
    }

    public static void showTeamPlacements() {
        System.out.println("Displaying team placements (Sorted by points)");

        // Sorting first by player points, if same points, then sorts by player point score
        Main.teams.sort(new PointScoreSorter());
        Collections.reverse(Main.teams);

        // TODO: ADD TEAM ID

        for (int i = 0; i < Main.teams.size(); i++) {
            System.out.println("\nTeam ID: "+ Main.teams.get(i).getID() +
                    "\n\tTeam Name: "+ Main.teams.get(i).getName() +
                    "\n\tPoints: "+ Main.teams.get(i).getPoints() +
                    "\n\tPointScore: "+ Main.teams.get(i).getPointScore() +
                    "\n\tKnocked out: "+ Main.teams.get(i).getTeamKnockedOut());
        }
    }

    private static int[] getTeamIDsFromMatchID(int indexMatchID) {
        int[] indexTeamsIDs = new int[] {-1, -1};
        for (TeamMatches tm : Main.teamMatches) {
            if (tm.getMatchID() == indexMatchID) {
                if (indexTeamsIDs[0] == -1) {
                    indexTeamsIDs[0] = tm.getTeamID();
                } else {
                    indexTeamsIDs[1] = tm.getTeamID();
                }
            }
        }
        return indexTeamsIDs;
    }

    private static String[] getTeamNamesFromTeamIDs(int[] indexTeamsIDs) {
        String[] indexTeamNames = new String[] {"null", "null"};
        for (Team team : Main.teams) {
            if (team.getID() == indexTeamsIDs[0] && indexTeamNames[0].equals("null")) {
                indexTeamNames[0] = team.getName();
            }
            if (team.getID() == indexTeamsIDs[1] && indexTeamNames[1].equals("null")) {
                indexTeamNames[1] = team.getName();
            }
        }
        return indexTeamNames;
    }

    public static void showMatches() {
        if (Main.matches.size() == 0) {
            System.out.println("\nNo matches to show!\n");
            return;
        }

        for (int i = 0; i < Main.matches.size(); i++) {
            int indexMatchID = Main.matches.get(i).getMatchID();

            int[] indexTeamsIDs = getTeamIDsFromMatchID(indexMatchID);
            String[] indexTeamNames = getTeamNamesFromTeamIDs(indexTeamsIDs);

            String printStr = "Match ID: "+ indexMatchID +"\n\t"+
                    "Starts at: "+ Main.matches.get(i).getMatchStartTime() +
                    " on "+ Main.matches.get(i).getMatchStartDate() +
                    "\n\t"+ indexTeamNames[0] +" vs "+ indexTeamNames[1];

            System.out.println(printStr);
        }
    }

    public static void getNextMatchTime() {
        for (Match match : Main.matches) {
            if (!match.getMatchDone()) {
                Main.matchesNotDone.add(match);
            }
        }
        System.out.println("\nNext match will be at this date: " + Main.matchesNotDone.get(0).getMatchStartDate() + " and this time: " + Main.matchesNotDone.get(0).getMatchStartTime() + "\n");
    }


    // While loop used to make sure a user inputs a correct string that can be parsed to integer
    private static int stringToInt(String stringOutput) {
        int parsedInt = 0;

        while (true) {
            String userInput = UI.getUserInput(stringOutput);
            if (checkParsePossible(userInput)) {
                parsedInt = Integer.parseInt(userInput);
                break;
            } else {
                System.out.println("The input you have given is not recognized by the system! Try again");
            }
        }
        return parsedInt;
    }

    // Checks if the string inputted can be changed to integer, returns true if its possible
    public static boolean checkParsePossible(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(Exception e) {
            return false;
        }
    }


    public static void runTournament() {
        if (Main.matches.size() == 0)
            System.out.println("No matches are available");

        for (Match match : Main.matches) {
            if (match.getMatchDone()) {
                continue;                   // match already finished!
            }

            int indexMatchID = match.getMatchID();

            int[] indexTeamsIDs = getTeamIDsFromMatchID(indexMatchID);
            String[] indexTeamNames = getTeamNamesFromTeamIDs(indexTeamsIDs);

            // TODO: MAYBE ADD getNestMatchTime()

            String indexMatchStr = "\nMatch ID: "+ match.getMatchID()+
                    "\n\t"+ indexTeamNames[0] +" vs "+ indexTeamNames[1];
            System.out.println(indexMatchStr);

            String team1ScoreMsg = "\n\tInput score for "+ indexTeamNames[0];
            int team1Goals = stringToInt(team1ScoreMsg);

            String team2ScoreMsg = "\n\tInput score for "+ indexTeamNames[1];
            int team2Goals = stringToInt(team2ScoreMsg);



        }
/*


            Team winnerTeam;
            int winnerTeamGoalsInt;
            Team loserTeam;
            int loserTeamGoalsInt;

            if (team1GoalsInt >= team2GoalsInt) {
                winnerTeam = team1;
                winnerTeamGoalsInt = team1GoalsInt;
                loserTeam = team2;
                loserTeamGoalsInt = team2GoalsInt;
            }
            else {
                winnerTeam = team2;
                winnerTeamGoalsInt = team2GoalsInt;
                loserTeam = team1;
                loserTeamGoalsInt = team1GoalsInt;
            }

            matchDone(winnerTeam,loserTeam,winnerTeamGoalsInt,loserTeamGoalsInt);

            Main.matches.remove(currentMatch);
            Data.saveData(null, null, null, Main.matches, null);

            Main.oldMatches.add(currentMatch);
            Data.saveData(null, null, null, null, Main.oldMatches);
        }
        UIData.deleteDataFile("Matches", new File("matchesData.txt"));
        UIData.deleteDataFile("Teams", new File("teamsData.txt"));
        Data.saveData(null, null, Main.currentTeams, null, null);


        System.out.println("\nCURRENT STAGE OF TOURNAMENT DONE!\n");
        if (Main.activeTeams.size() == 1) {
            System.out.println("\uD83C\uDFC6 " +  Main.activeTeams.get(0).getName() +" HAS WON THE TOURNAMENT \uD83C\uDFC6");
        }*/
    }

    public static void matchDone(Team winnerTeam, Team loserTeam, int winnerGoals, int loserGoals) {
        // Increase games played and games won
        winnerTeam.setGamesPlayed(winnerTeam.getGamesPlayed() + 1);
        winnerTeam.setGamesWon(winnerTeam.getGamesWon() + 1);
        loserTeam.setGamesPlayed(loserTeam.getGamesPlayed() + 1);

        // Add points to teams
        winnerTeam.setPoints(winnerTeam.getPoints() + 2);
        winnerTeam.setPointScore(winnerTeam.getPointScore() + winnerGoals - loserGoals);
        loserTeam.setPointScore(loserTeam.getPointScore() + loserGoals - winnerGoals);

        // Knock loser out of tournament
        loserTeam.teamHasBeenKnockedOut();
//        Main.activeTeams.add(winnerTeam);
    }

   public static Team findTeam(String name) {
       Team teamFound;
        for (int i = 0; i < Main.teams.size(); i++) {
           if (Main.teams.get(i).getName().equals(name)) {
               teamFound = Main.teams.get(i);
               return teamFound;
           }
        }
        return null;
    }
//
//    public static void debugData() {
//        System.out.println("\nCURRENT TEAMS\n");
//        for (int i = 0; i < Main.currentTeams.size(); i++) {
//            System.out.println(Main.currentTeams.get(i).getName());
//        }
//        System.out.println("================");
//
//        System.out.println("\nACTIVE TEAMS\n");
//        for (int i = 0; i < Main.activeTeams.size(); i++) {
//            System.out.println(Main.activeTeams.get(i).getName());
//        }
//        System.out.println("================");
//
//        System.out.println("\nMATCHES\n");
//        for (int i = 0; i < Main.matches.size(); i++) {
//            System.out.println(Main.matches.get(i).getTeam1() + Main.matches.get(i).getTeam2());
//        }
//        System.out.println("================");
//
//        System.out.println("\nOLD MATCHES\n");
//        for (int i = 0; i < Main.oldMatches.size(); i++) {
//            System.out.println(Main.oldMatches.get(i).getTeam1() + " vs " + Main.oldMatches.get(i).getTeam2());
//        }
//    }
}

