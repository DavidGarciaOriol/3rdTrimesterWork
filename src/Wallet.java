public class Wallet {

    float balance;
    User owner;
    Transaction[] transactions;
    float fee;

    public Wallet(float balance, User owner, Transaction[] transactions, float fee) {
        this.balance = balance;
        this.owner = owner;
        this.transactions = transactions;
        this.fee = fee;
    }

    /**
     * Class methods
     * @return - - -
     */

    public boolean makeTransfer(User user){
        return false;
    }

    /**
     * Getter&Setters
     * @return Class values
     */

    public User getOwner() {
        return owner;
    }

    public float getBalance() {
        return balance;
    }

    public float getFee() {
        return fee;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }
}
