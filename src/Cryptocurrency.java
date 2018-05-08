public class Cryptocurrency extends Coin {
    
    private String network;

    public Cryptocurrency(String shortname, String network) {
        super(shortname);
        this.network = network;
    }
}