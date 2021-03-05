import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static BankAccount[] accounts = new BankAccount[4];

	public static void main(String[] args) {
		/*accounts[0] = new BankAccount(30000);
		accounts[1] = new BankAccount(30000);
		accounts[2] = new BankAccount(30000);
		accounts[3] = new BankAccount(30000);
		assignPlayer(accounts[0]);
		assignPlayer(accounts[1]);
		assignPlayer(accounts[2]);
		assignPlayer(accounts[3]);*/
		readGameData();

		//printAccounts();
		//accounts[0].withDrawAmount();

		//printAccounts();
		//saveGameData();

	}

	private static void readGameData() {
		try {
			File file= new File("data.text");
			Scanner fileReader = new Scanner(file);
			String [] accountLine;
			int i = 0;
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				accountLine = data.split(":");
				System.out.print(accountLine[0]);
				System.out.print(accountLine[1]);
				System.out.println();
				float saldo = Float.parseFloat(accountLine[1]);
				accounts[i] = new BankAccount(saldo);
				accounts[i].setOwner(accountLine[0]);
				i=i++;
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		}
	}

	public static void printAccounts(){
		for (BankAccount a:accounts){
			System.out.println(a);
		}
	}

	public static void saveGameData(){
		String gameData="";
		for (BankAccount a:accounts){
			gameData+=a.getOwner()+" : "+a.getSaldo()+"\n";
		}
		try {
			FileWriter writer = new FileWriter("data.text");
			writer.write(gameData);
			writer.close();
		}catch (IOException e) {
			System.out.println(e.getCause());
		}
	}
	public static void assignPlayer(BankAccount account){

		String input = getUserInput("Skriv kontoejers navn: ");
		account.setOwner(input);
		System.out.println(account.getOwner());
	}
	public static String getUserInput(String msg){
		System.out.println(msg);
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

}