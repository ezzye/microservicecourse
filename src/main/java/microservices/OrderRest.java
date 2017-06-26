package microservices;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ellioe03 on 26/06/2017.
 */
@Named
@Path("/")
public class OrderRest {


    private static List<Order> Orders = new ArrayList<Order>();
    static {
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setProductCode("Prod1");
        order1.setQty(1);
        Orders.add(order1);

        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setProductCode("Prod2");
        order2.setQty(2);
        Orders.add(order2);

        Order order3 = new Order();
        order3.setOrderId(3);
        order3.setProductCode("Prod3");
        order3.setQty(3);
        Orders.add(order3);
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() {
        return Orders;
    }


    @GET
    @Path("order")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(@QueryParam("id") long id) {
        Order or = null;
        for (Order o : Orders) {
            if (o.getOrderId() == id)
                or = o;
        }
        return or;
    }

}
