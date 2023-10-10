package codigo;

public class Holder {
    private final int account;
    private String holder;
    private double balance;


    //construct
    public Holder(int account, String holder, double initialDeposit) {
        this.account = account;
        this.holder = holder;
        depositBalance(initialDeposit);
    }

    public Holder(int account, String holder) {
        this.account = account;
        this.holder = holder;

    }


    public int getAccount() {
        return account;
    }


    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance(){
        return balance;
    }



    //metódos:

    public String toString(){
        return "Account: "
                + account
                + ", Holder: "
                + holder
                + String.format(", Balance: %.2f $ ",balance);
    }

    public void depositBalance(double deposit){
        balance += deposit;
    }

    public void withdrawBalance(double withdraw){
        balance -= (withdraw+5.0);

    }
}





