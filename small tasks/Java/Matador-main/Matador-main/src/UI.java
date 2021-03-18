import java.util.Locale;
import java.util.Scanner;

public class UI {

    public void createAccounts(){
        String input="";
        System.out.println("Skriv q for at stoppe med at lave flere spillere.");
        while(Main.players.size()<6){
            input = getUserInput("Skriv navnet på spiller: ");
            if (input.toUpperCase().equals("Q")){
                break;
            }
            Player tmpPlayer=new Player(input,30000);
            Main.players.add(tmpPlayer);
        }
    }


    public static String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}