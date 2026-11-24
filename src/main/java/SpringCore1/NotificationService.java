package SpringCore1;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
//    Inside levels Loose coupling 1
//    dependency
    @Setter
    private Notification notification;

//    Dependency Injection from constructure
//    public NotificationService(Notification notification){
//        this.notification = notification;
//    }

//
//    public void setNotification(Notification notification) {
//        this.notification = notification;
//    }

    public void notifyUser(){
        notification.sendMessage();
    }

}
