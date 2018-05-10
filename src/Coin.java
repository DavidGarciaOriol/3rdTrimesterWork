import java.util.UUID;

public abstract class Coin {

    String name;
    String shortname;
    UUID id;


    public Coin(String name,String shortname,UUID id){
        this.name=name;
        this.shortname=shortname;
        this.id=id;
    }

    public void buy(){

    }

    public Coin exchange(){
        return null;
    }

    public void transfer(User user){

    }

}
