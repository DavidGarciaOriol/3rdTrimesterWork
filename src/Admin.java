import com.sun.deploy.jcp.controller.Network;

import java.util.UUID;

public class Admin extends User {


    public Admin(String name, String user, UUID uuid, String email) {
        super(name,user,uuid,email);
    }

    public void ban(User user){

    }
}
