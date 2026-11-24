package SpringCore1;

public class TelegramService implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Telegram @Service");
    }
}
