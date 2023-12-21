package disign_patterns.behavioral.chain_of_responsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = (request.getUsername().equals("admin") && request.getPassword().equals("1234"));
        System.out.println("Authentication");
        return !isValid;
    }
}
