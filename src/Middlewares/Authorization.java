public class Authorization extends Middleware {


    public boolean authorize(User user, Action action){
        // determine if a user is allowed to do a certain action
        return false;
    }
}