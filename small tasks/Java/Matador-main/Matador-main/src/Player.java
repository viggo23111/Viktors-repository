public class Player {
    String name;
    int id;
    int counter=1;
    private BankAccount bankaccount;

    public Player(String name, float saldo){
        this.name = name;
        this.id=counter;
        this.bankaccount=new BankAccount(saldo);
        counter++;
    }

    public String getName() {
        return name;
    }

    public float getPlayerBalance() {
        float balance=bankaccount.getBalance();
        return balance;
    }

    @Override
    public String toString() {
        String str;
        str= name+": "+ bankaccount.getBalance();
        return str;
    }

    public int getId() {
        return id;
    }
}
