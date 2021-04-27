import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;
import java.time.format.ResolverStyle;
// import java.util.concurrent.ExecutionException;

public class UIData {

    // Check for existing data
//    public static void checkData(String dataType, String fileName) {
//        if (loadDataInterface(dataType, fileName))
//            Data.loadData(fileName);
//        else if (dataType.equals("Tournament"))
//            createTournament();
//        else if (dataType.equals("Team"))
//            createTeam();
////        else if (dataType.equals("Match"))
////            createMatch();
//    }

    // Checks if data of inputted type and filename exists, returns true if user would like to load existing data
    public static boolean loadDataInterface(String dataType, String fileName) {
        File dataFile = new File(fileName);
        while (true) {
            if(new File(fileName).length() > 0) {
                String dataExists = "Previous "+ dataType +" data already exists.\nWould you like to load this "+
                        dataType +" data?\ny/n\n";
                String dataExistsInput = UI.getUserInput(dataExists);

                if (dataExistsInput.equals("y")) {
                    // User would like to load existing data
                    return true;
                }
                else if (dataExistsInput.equals("n")) {
                    // Existing data exists, but user would like to create new
                    deleteDataFile(dataFile);
                    return false;
                }
                else {
                    System.out.println("Response not recognized by system\n");
                }
            }
            else {
                // System found no data to load
                System.out.println("No "+ dataType +"data available to load!\n");
                return false;
            }
        }
    }

    // Deletes old txt files
    //public static void deleteDataFile(String dataType, File dataFile) {
    public static void deleteDataFile(File dataFile) {
        try {
            FileWriter writer = new FileWriter(dataFile);
            writer.write("");
            writer.close();
            System.out.println("Wiped - " + dataFile.getName());
            // System.out.println("Deleted previous "+ dataType +" data");
        } catch (IOException e) {
            // System.out.println("Failed to delete previous "+ dataType +" data");
        }
    }



//    public static void loadDataIfExists(String fileName) {
//        File dataFile = new File(fileName);
//        if (dataFile.exists()) {
//            Data.loadData(fileName);
//        } else {
//            System.out.println(fileName + "does not exist!");
//        }
//    }


    // FOUNDER
    // Creates a new founder and returns it + saves to txt file
//    public static void createFounder() {
//        String founderName = "Input the name of the tournament organizer / founder\n";
//        String founderNameInput = UI.getUserInput(founderName);
//        Founder founder = new Founder(founderNameInput);
//        Data.saveData(null, founder, null, null, null);
//        Main.currentFounder = founder;
//    }

    public static boolean isValidDate(String dateInput) {
        boolean valid = false;
        try {
            LocalDate.parse(dateInput,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                    .withResolverStyle(ResolverStyle.STRICT));
            valid = true;
        }
        catch (DateTimeParseException e) {
            e.printStackTrace();
            valid = false;
        }
        return valid;
    }

    public static boolean isValidTime(String timeInput) {
        boolean valid = false;
        try {
            LocalTime.parse(timeInput);
            valid = true;
        }
        catch (DateTimeParseException e) {
            valid = false;
        }
        return valid;
    }


    // TOURNAMENT
    // Creates a new tournament and returns it + saves to txt file
    public static void createTournament() {
        String tournamentNameMsg = "Input name of tournament:\n";
        String tournamentNameInput = UI.getUserInput(tournamentNameMsg);

        String tournamentFounderNameMsg = "Input name of founder:\n";
        String tournamentFounderNameInput = UI.getUserInput(tournamentFounderNameMsg);

        String[] dateAndTimeMessages = {"\nInput time of day the tournament shall start\nEx. 18:00\n",
                                        "\nInput date the tournament shall start\nEx. 2021-01-30\n",
                                        "\nInput date the tournament due date\nEx. 2021-01-30\n"};
        String[] userDateAndTimeInputs = {"", "", ""};
        LocalTime tournamentStartTime = LocalTime.now();
        LocalDate tournamentStartDate = LocalDate.now();
        LocalDate tournamentDueDate = LocalDate.now();
        for (int i = 0; i < 3; i++) {
            while (true) {
                userDateAndTimeInputs[i] = UI.getUserInput(dateAndTimeMessages[i]);
                if (isValidTime(userDateAndTimeInputs[i]) || isValidDate(userDateAndTimeInputs[i])) {
                    if (i == 0) {tournamentStartTime = LocalTime.parse(userDateAndTimeInputs[i]); break;}
                    if (i == 1) {tournamentStartDate = LocalDate.parse(userDateAndTimeInputs[i]); break;}
                    if (i == 2) {tournamentDueDate = LocalDate.parse(userDateAndTimeInputs[i]); break;}
                } else System.out.println("\nWrong date or time format! Try again!\n");
            }
        }
        Main.getIO().saveTournament(tournamentNameInput, tournamentFounderNameInput, tournamentStartTime, tournamentStartDate, tournamentDueDate);

        System.out.println("\nNew tournament created!"+
                "\n\t Tournament Name: \t\t"+ tournamentNameInput +
                "\n\t Tournament Founder: \t\t"+ tournamentFounderNameInput +
                "\n\t Tournament Start Time: \t"+ tournamentStartTime +
                "\n\t Tournament Start Date: \t\t"+ tournamentStartDate +
                "\n\t Tournament Due Date: \t"+ tournamentDueDate);
    }
        //LocalTime tournamentStartTime;
//        while (true) {
//            String tournamentStartTimeMsg = "Input time of day the tournament shall start\nEx. 18:00\n";
//            String userTimeInput = UI.getUserInput(tournamentStartTimeMsg);
//            if (isValidTime(userTimeInput)) {
//                tournamentStartTime = LocalTime.parse(userTimeInput);
//                break;
//            } else {
//                System.out.println("\nWrong time format! Try again!\n");
//            }
//        }

        //LocalDate tournamentStartDate;
//        while (true) {
//            String tournamentStartDateMsg = "Input date the tournament shall start\nEx. 2021-01-30\n";
//            String userDateInput = UI.getUserInput(tournamentStartDateMsg);
//            if (isValidDate(userDateInput)) {
//                tournamentStartDate = LocalDate.parse(userDateInput);
//                break;
//            } else {
//                System.out.println("\nWrong date format! Try again!\n");
//            }
//        }

        //LocalDate tournamentDueDate;
//        while (true) {
//            String tournamentStartDateMsg = "Input date the tournament due date\nEx. 2021-01-30\n";
//            String userDateInput = UI.getUserInput(tournamentStartDateMsg);
//            if (isValidDate(userDateInput)) {
//                tournamentDueDate = LocalDate.parse(userDateInput);
//                break;
//            } else {
//                System.out.println("\nWrong date format! Try again!\n");
//            }
//        }



    // Checks if the string inputted can be changed to integer, returns true if its possible
//    public static boolean checkParsePossible(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch(Exception e) {
//            return false;
//        }
//    }


    // TEAM
    public static void createTeam()  {
        String teamNameMsg = "Input name of team\n";
        String teamNameInput = UI.getUserInput(teamNameMsg);

        Main.getIO().saveNewTeam(teamNameInput);
    }

    // PLAYER
    public static void createPlayer() {
        if (Main.teams.size() == 0) {
            System.out.println("\nYou must create a team before you can create players!\n");
        }
        else {
            String playerNameMsg = "Input name of player\n";
            String playerNameInput = UI.getUserInput(playerNameMsg);

            for (int i = 0; i < Main.teams.size(); i++) {
                Team indexTeam = Main.teams.get(i);
                String teamName = indexTeam.getName();

                int amountOfPlayersOnTeam = 0;
                for (Player player : Main.players) {
                    if (player.getTeamID() == indexTeam.getID()) amountOfPlayersOnTeam++;
                }

                System.out.println("\n\tID : "+ indexTeam.getID() +"\t - \t"+ teamName +" = "+ amountOfPlayersOnTeam +" players on team");
            }

            String joinTeamInput;
            while (true) {
                String joinTeamMsg = "\nInput the ID of the team the player should join\n";
                joinTeamInput = UI.getUserInput(joinTeamMsg);

                try {Integer.parseInt(joinTeamInput); break;}
                catch (Exception e) {System.out.println("\nInput is not a number!\nTry again!");}
            }
            Main.getIO().savePlayer(playerNameInput, Integer.parseInt(joinTeamInput));
        }
    }

    // MATCH
    public static void createMatches() {
        // Main.matches.clear();
//
//        boolean teamSizeCorrect = false;
//        if (Main.teams.size() == 2)
//            teamSizeCorrect = true;

        // TODO: TEST THIS!!!
//        if (Main.teams.size() % 4 != 0 || Main.teams.size() != 2) {
        if (Main.teams.size() % 4 != 0) {
            System.out.println("\nAmount of teams must be divisible by 4!\n");
            return;
        }
//        else teamSizeCorrect = true;

//        if (teamSizeCorrect) {
        else {
            ArrayList<Team> localTeams = new ArrayList<>();
            for (Team team : Main.teams) {
                if (!team.getTeamKnockedOut()) {
                    localTeams.add(team);
                }
            }
            Collections.shuffle(localTeams);            // Sorting teams randomly

            int amountOfMatches = localTeams.size() / 2;
            int matchDurationMinutes = 30;

            // get date and time from current matches, else get from tournament
            LocalTime matchStartTime = Main.tournament.getTournamentStartTime().minusMinutes(matchDurationMinutes);
            LocalDate matchStartDate = Main.tournament.getTournamentStartDate();
            if (Main.matches.size() != 0) {
                Match lastMatch = Main.matches.get(Main.matches.size() - 1);
                matchStartTime = lastMatch.getMatchStartTime().plusMinutes(matchDurationMinutes);
                matchStartDate = lastMatch.getMatchStartDate();
            }

            int teamCounter = 0;
            for (int i = 0; i < amountOfMatches; i++) {

                matchStartTime = matchStartTime.plusMinutes(matchDurationMinutes);
                if (matchStartTime.isBefore(LocalTime.parse("01:00"))) {        // new day
                    int amountOfMatchesLeft = amountOfMatches - i;
                    int timeNeededForRemainingMatches = amountOfMatchesLeft * matchDurationMinutes;
                    matchStartTime = LocalTime.parse("23:00").minusMinutes(timeNeededForRemainingMatches);

                    matchStartDate = matchStartDate.plusDays(1);
                }
                Main.getIO().saveMatches(matchStartTime, matchStartDate,false);

                int thisMatchID = Main.matches.get(Main.matches.size() - 1).getMatchID();
                for (int j = 0; j < 2; j++) {
                    int teamID = localTeams.get(teamCounter).getID();
                    Main.getIO().saveNewTeamMatches(thisMatchID, teamID, 0);
                    teamCounter++;
                }
            }
            System.out.println("Matches generated!");
        }
    }
}
