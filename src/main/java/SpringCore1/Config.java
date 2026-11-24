package SpringCore1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Notification getNotification(){
        return new EmailService();
    } // Take this and injection into NotificationService

//    dependency injection
    @Bean
    public NotificationService getNotificationService(Notification notification){
        NotificationService service = new NotificationService();
        service.setNotification(notification);
        return service;
    }
}
