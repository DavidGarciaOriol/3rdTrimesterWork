import java.util.UUID;

public class Client extends User {

    Wallet wallet;
    String network;

    public Client(String name, String user, UUID uuid, String email,Wallet wallet,String network) {
        super(name,user,uuid,email);
        this.wallet=wallet;
        this.network=network;
    }

    public void transfer(Client to){

    }

    public void useWallet(){

    }
}
