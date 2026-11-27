package SpringCore1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Notification getEmailNotification(){
        return new EmailService();
    }
    @Bean Notification getTelegramNotification(){
        return new TelegramService();
    }
//    Take this and injection into NotificationService

//    implicit dependency injection
    @Bean
    public NotificationService getNotificationService(){
        return new NotificationService();
    }
}
