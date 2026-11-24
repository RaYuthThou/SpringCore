package SpringCore1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(Config.class);
        NotificationService bean = context.getBean(NotificationService.class);
        bean.notifyUser();
    }
}
