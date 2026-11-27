package springCore2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(config.class);
        OrderClient bean = context.getBean(OrderClient.class);
        bean.displayOrder();
    }
}
