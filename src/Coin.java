/**
    Coin class. Represents a single unit of a digital coin.
    @param shortname it's the acronym of the coin's name.
*/
public abstract class Coin {

    public String name;    
    public String shortname;
    private UUID id;
    private Network network;
    
    public Coin(String shortname) {
        // Pull data from database
    }

    public void buy() {

    }

    /**
        Converts this type of coin to another.
    */
    public Coin exchange(Coin to) {
        return new Exchange(this, to);
    }

    public void transfer(User user) {

    }

}
