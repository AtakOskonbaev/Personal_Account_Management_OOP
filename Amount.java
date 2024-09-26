//amount of transaction
public class Amount
{
    private double amount;
    private TransactionType transactionType;

    public Amount(double amount, TransactionType transactionType)
    {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String toString()
    {
        return "Transaction Type: " + transactionType + ". Amount: " + amount;
    }
}