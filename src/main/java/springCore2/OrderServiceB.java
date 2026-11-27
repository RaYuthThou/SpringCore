package springCore2;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceB implements OrderService{
    @Override
    public String order() {
        return "Order from @Service B";
    }
}
