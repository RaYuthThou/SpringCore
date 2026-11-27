package springCore2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceA implements OrderService{
    @Override
    public String order() {
        return "Order from @Service A";
    }
}
