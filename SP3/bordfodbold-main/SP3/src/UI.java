import java.io.File;
import java.util.Scanner;

public class UI {

//    public UI() {}

    public static String getUserInput(String msg){
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static Tournament welcomeMessage() {
        System.out.println("Welcome to Table Football tournament manager!");

        File f = new File("tournamentData.txt");

        boolean runningWelcomeMessage = true;
        while (runningWelcomeMessage) {
            if (f.exists()) {
                String dataExists = "Previous data already exists.\nWould you like to load this tournament data?\ny/n\n";
                String input = getUserInput(dataExists);

                if (input.equals("y")) {
                    // TODO
                    // load data from TXT file
                    return null;
                }
                else if (input.equals("n")) {
                    String confirmationMsg = "Are you sure you want to create a new tournament?\ny/n\n";
                    String input2 = getUserInput(confirmationMsg);

                    if (input2.equals("y")) {

                        if (f.delete()) {
                            System.out.println("Old tournament data successfully deleted!");
                        } else {
                            System.out.println("Failed to delete old tournament data");
                        }

                        Tournament newTournament = createNewTournament();
                        return newTournament;
                    }
                    else if (input2.equals("n")) {
                        System.out.println("Well what would you like to do then?\n");
                    }
                    else {
                        System.out.println("Response not recognized by system\n");
                    }
                }
                else {
                    System.out.println("Response not recognized by system\n");
                }
            }
            else {
                System.out.println("No data exists! Creating new tournament!\n");
                Tournament newTournament = createNewTournament();
                return newTournament;
            }
        }
        return null;    // hopefully we dont make it here..
    }

    public static boolean checkParsePossible(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static int stringToInt(String stringOutput) {
        int parsedInt = 0;
        boolean waitingForUserInput = true;

        while (waitingForUserInput) {
            String userInput = getUserInput(stringOutput);
            if (checkParsePossible(userInput)) {
                parsedInt = Integer.parseInt(userInput);
                break;
            } else {
                System.out.println("The input you have given is not recognized by the system! Try again");
            }
        }
        return parsedInt;
    }

    public static Tournament createNewTournament() {
        // Tournament name
        String tournamentNameMsg = "Input name of tournament\n";
        String tournamentNameInput = getUserInput(tournamentNameMsg);

        // Tournament start time
        String tournamentStartTimeMsg = "Input time of day the tournament shall start\nEx. 18\n";
        int tournamentStartTimeInt = stringToInt(tournamentStartTimeMsg);

        // Tournament day of month
        String tournamentDayOfMonthMsg = "Input which date of the month the tournament shall start\nEx. 28\n";
        int tournamentDayOfMonthInt = stringToInt(tournamentDayOfMonthMsg);

        // Tournament month
        String tournamentMonthMsg = "Input which date of month the tournament will be held\nEx. 12\n";
        int tournamentMonthInt = stringToInt(tournamentMonthMsg);

        // Tournament year
        String tournamentYearMsg = "Input which year the tournament will be held\nEx. 2021\n";
        int tournamentYearInt = stringToInt(tournamentYearMsg);

        // Tournament due date
        String tournamentDueDateMsg = "Input date of which teams must have signed up\nEx. 08-04-2021\n";
        String tournamentDueDateInput = getUserInput(tournamentDueDateMsg);

        Tournament tournament = new Tournament(tournamentNameInput, tournamentStartTimeInt, tournamentDayOfMonthInt, tournamentMonthInt, tournamentYearInt, tournamentDueDateInput, 0);

        System.out.println("New tournament created!"+
                "\n\t Tournament Name: \t\t"+ tournamentNameInput +
                "\n\t Tournament StartTime: \t"+ tournamentStartTimeInt +
                "\n\t Tournament Date: \t\t"+ tournamentDayOfMonthInt +"-"+ tournamentMonthInt +"-"+ tournamentYearInt +
                "\n\t Tournament Due Date: \t"+ tournamentDueDateInput);

        Main.data.saveData(tournament, null, null);
        return tournament;
    }

    public static void createNewTeam()  {
        // Team name
        String teamNameMsg = "Input name of team\n";
        String teamNameInput = getUserInput(teamNameMsg);

        // Team player 1 name
        String player1NameMsg = "Input name of player 1 on team\n"+ teamNameInput;
        String player1NameInput = getUserInput(player1NameMsg);

        // Team player 2 name
        String player2NameMsg = "Input name of player 2 on team\n"+ teamNameInput;
        String player2NameInput = getUserInput(player2NameMsg);

        String[] teamPlayerNames = {player1NameInput, player2NameInput};

        Team team = new Team(teamNameInput, teamPlayerNames, 0, 0, 0, 0, false);
        //Main.currentTournament.setAmountOfTeams(Main.currentTournament.getAmountOfTeams() + 1);

        System.out.println("New team created!"+
                "\n\t Team Name: \t"+ teamNameInput +
                "\n\t Team Player 1: \t"+ player1NameInput +
                "\n\t Team Player 2: \t"+ player2NameInput);

        Main.currentTeams.add(team);
    }
}
