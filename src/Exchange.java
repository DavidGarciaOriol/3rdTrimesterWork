public class Exchange {

    Coin from;
    Coin to;

    public Exchange(Coin from, Coin to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Class methods
     * @return - - -
     */

    public float calcFees(Coin from, Coin to){
        return 0;
    }

    public float calcValue(Coin from, Coin to) {
        return 0;
    }

    public Coin getExchange(Coin from, Coin to){
        return null;
    }

    /**
     * Getter&Setters
     * @return Class values
     */

    public Coin getFrom() {
        return from;
    }

    public Coin getTo() {
        return to;
    }

    public void setFrom(Coin from) {
        this.from = from;
    }

    public void setTo(Coin to) {
        this.to = to;
    }
}
