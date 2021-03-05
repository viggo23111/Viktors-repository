import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount{
	private float saldo;
	private String owner;
	float[] transactions = new float[100];
	private int id=0;
	private static int counter;
	//  ArrayList<Float> transaction = new ArrayList<>();

	public BankAccount(float saldo){
		this.saldo = saldo;
		this.id=counter++;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public String getOwner(){
		return owner;
	}

	public float getSaldo() {
		return saldo;
	}

	@Override
	public String toString(){
		String str;
		str= owner+" : "+saldo;
		return str;
	}

	public void withDrawAmount() {
		int input=0;
		try {
			input = Integer.parseInt( Main.getUserInput("Træk beløb:"));
		}catch (InputMismatchException e){
			System.out.println(e.toString());
			input = Integer.parseInt( Main.getUserInput("Træk beløb:"));
		}
		this.saldo = saldo-input;
	}
}