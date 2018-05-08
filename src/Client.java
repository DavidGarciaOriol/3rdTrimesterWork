/**
    Represents a generic user.
*/

public class Client extends User {

    private Wallet wallet;
    private String network;

    public Client(String name, String user, UUID uuid, String email, Wallet wallet, String network) {
        super(name, user, uuid, email);
        this.wallet = wallet;
        this.network = network;
    }
    
    public void transfer(Client toTransfer) {
        // make a trasnfer to anther client.
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetwork() {
        return this.network;
    }

    public Wallet getWallet() {
        return this.wallet;
    } 
}