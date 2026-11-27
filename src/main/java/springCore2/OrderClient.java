package springCore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderClient {
//    injection point
//    Qualifier , name , primary like set name for an object
//    @Autowired
//    @Qualifier("orderServiceB") // Qualifier use with Autowired  but resource
    private OrderService orderService;


    // Constructure as injection point
    public OrderClient(@Qualifier("orderServiceA") OrderService orderService){
        this.orderService = orderService;
    }
    public void displayOrder(){
        System.out.println(orderService.order());
    }
}
