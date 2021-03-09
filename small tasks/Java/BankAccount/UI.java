import java.util.ArrayList;
import java.util.Scanner;

public class UI {


    public void createAccounts(){
        int amountOfPlayer = Integer.parseInt(getUserInput("skriv antal deltager: "));
        for (int i = 0; i < amountOfPlayer; i++) {
            Main.accounts.add (new BankAccount(30000f));
            assignPlayer(Main.accounts.get(i));
        }
    }
    public static void assignPlayer(BankAccount account){
        String playerName = getUserInput("Skriv kontoejers navn: ");
        account.setOwner(playerName);
        System.out.println(account.getOwner());
    }

    public static String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
