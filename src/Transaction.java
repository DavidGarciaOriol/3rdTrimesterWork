import java.util.Date;

public class Transaction {

    User from;
    User to;
    Date createdAt;
    float quantity;

    public Transaction(User from, User to, Date createdAt, float quantity) {
        this.from = from;
        this.to = to;
        this.createdAt = createdAt;
        this.quantity = quantity;
    }

    /**
     * Class methods
     * @return - - -
     */

    public float calcFees(Coin from, Coin to){
        return 0;
    }

    public void transfer() {

    }

    /**
     * Getter&Setters
     * @return Class values
     */

    public Date getCreatedAt() {
        return createdAt;
    }

    public float getQuantity() {
        return quantity;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
