/**
    Represents a user with special privileges and actions.
*/
public class Admin extends User {
    public Admin(name, String user, UUID uuid, String email) {
        super(name, user, uuid, email);
    }

    private void ban(User user) {
        // ban the specified user.
    }
}