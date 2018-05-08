import java.util.UUID;

public class User {

    String name;
    String username;
    UUID id;
    String email;

    public User(String name, String user, UUID uuid, String email) {
        this.name = name;
        this.username = user;
        this.id = uuid;
        this.email = email;
    }

    /**
     * Class methods
     * @return - - -
     */

    public boolean touch(){
        return false;
    }

    public boolean save(){
        return false;
    }

    /**
     * Getter&Setters
     * @return Class values
     */

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
