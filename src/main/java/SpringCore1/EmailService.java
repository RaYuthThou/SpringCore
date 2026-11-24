package SpringCore1;

public class EmailService implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Email @Service");
    }
}
