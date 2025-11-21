package ie.atu;

public class BankAccount {

    private String accNum;
    private String name;
    private double balance, addDep;

    public BankAccount(String accNum, String name, double balance)
    {
        if(balance<= 0)
            throw new IllegalArgumentException("Negative balance is not allowed.");

        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public Object getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double newDeposit(double balance, double addDep) {
        if(addDep <= 0)
            throw new IllegalArgumentException("Negative balance is not allowed.");
        else
            return balance + addDep;
    }

    public double withdrawal(double balance, double withdraw) {
        if(withdraw <= 0)
            throw new IllegalArgumentException("Negative Withdrawal is not allowed.");
        else
            return balance - withdraw;
    }
}
