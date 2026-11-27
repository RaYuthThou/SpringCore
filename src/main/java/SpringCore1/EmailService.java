package SpringCore1;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Email @Service");
    }
}
