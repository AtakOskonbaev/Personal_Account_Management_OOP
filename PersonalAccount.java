import java.util.ArrayList;

//bank account with basic operations
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    //constructor
    public PersonalAccount(int accountNumber, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
        transactions = new ArrayList<Amount>();
    }

    //deposits amount into account
    public void deposit(double amount)
    {
        Amount depositOperation = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(depositOperation);
        balance += amount;
    }

    //withdraws amount from account
    public void withdrawal(double amount)
    {
        if(balance >= amount)
        {
            Amount withdrawalOperation = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawalOperation);
            balance -= amount;
        }
    }

    //prints transaction history
    public void printTransactionHistory()
    {
        for (Amount amount: transactions)
        {
            System.out.println(amount);
        }
    }

    // returns user's balance
    public double getBalance()
    {
        return balance;
    }

    //return user's account number
    public int getAccountNumber()
    {
        return accountNumber;
    }

    //returns user's name
    public String getAccountHolder()
    {
        return accountHolder;
    }
}
