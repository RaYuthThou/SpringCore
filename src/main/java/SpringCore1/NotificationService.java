package SpringCore1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    /* injection point from field */
    @Autowired
    @Qualifier("getTelegramNotification")
    private Notification notification;

//  injection point from constructure
//    public NotificationService(Notification notification) {
//        this.notification = notification;
//    }
    public void notifyUser(){
        notification.sendMessage();
    }

}
