public class BankAccount{
    public float balance;
    //todo: Er denne overhovedet nødvendig? Slet evt. Eller lav om til en ArrayList

    float[] transactions = new float[100];


    public BankAccount(float saldo){
        this.balance = saldo;
    }


    public void withdrawAmount(int amount) {
        balance = balance -amount;
    }

    public float getBalance() {
        return this.balance;
    }
}