import java.util.UUID;

public class Cryptocurrency extends Coin {

    String network;

    public Cryptocurrency(String name, String shortname, UUID id,String network){
        super(name,shortname,id);
        this.network=network;
    }
}
