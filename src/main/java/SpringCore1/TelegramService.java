package SpringCore1;

import org.springframework.stereotype.Component;

@Component
public class TelegramService implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Telegram @Service");
    }
}
