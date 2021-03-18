/**
 * Matador
 * En digital version af det klassiske matador spil
 * Anvendt i undervisingen på Dat 1, cphbusiness academy
 *
 * @author Tess Gaston
 * @version 1.0
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static ArrayList<Player> players = new ArrayList<>();
    public static UI ui = new UI();
    public static Board board;


    public static void main(String[] args) throws IOException {
        //Hvis et spil er i gang, vil der blive loadet data fra sidste session, ellers vil brugeren blive bedt om at registrere deltagere
        try{
            readGameData();
        }catch(IOException e){
            System.out.println("Velkommen til Matador ");
            ui.createAccounts();
        }
        System.out.println(getGameData());

        board = new Board();  // System.out.println(findPlayerById(1));
        System.out.println(findPlayerByName("viktor"));
        // gem spillets tilstand
        saveGameData();
    }

    /**
     * Denne metode læser sidste sessions spildata fra en tekstfil, hvor hver linie repræsenterer en spillers konto
     * For hver linie i tekstfilen oprettes en konto med liniens saldo og ejernavn
     * @throws IOException
     */

    public static void readGameData() throws IOException{
        String [] accountLine;
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            accountLine = line.split(":");
            players.add(new Player(accountLine[0],Float.parseFloat(accountLine[1])));
        }
    }

    /**
     * Denne metode gemmer sessionens tilstand, dvs listen af konti i formen ejernavn:saldo
     */
    public static void saveGameData(){
        String gameData = getGameData();
        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write(gameData);
            writer.close();
        }catch (IOException e){
            System.out.println(e.getCause());
        }
    }

    public static Player findPlayerById(int id) {
        for (Player p: players){
            if (p.getId()==id){
                return p;
            }
        }
        return null;
    }
    public static Player findPlayerByName(String name) {
        for (Player p: players){
            String str1=p.getName().toLowerCase();
            String str2=name.toLowerCase();
            System.out.println("Find name:"+name);
            System.out.println("Players name:"+p.getName());
            if (str1.equals(str2)){
                return p;
            }
        }
        return null;
    }

    /**
     * Denne metode henter alt spil data
     */
    public static String getGameData(){
        String s="";
        for (Player p:players) {
            s += p+"\n";
        }
        return s;
    }
}