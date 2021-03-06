package microservices;

import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ellioe03 on 26/06/2017.
 */
@Named
@Path("/")
public class StockRest {

    static List<Stock> Stocks = new ArrayList<Stock>();

    static {

        Stock stock1 = new Stock();
        stock1.setProductCode("Prod1");
        stock1.setQty(1);
        Stocks.add(stock1);

        Stock stock2 = new Stock();
        stock2.setProductCode("Prod2");
        stock2.setQty(1);
        Stocks.add(stock2);

        Stock stock3 = new Stock();
        stock3.setProductCode("Prod3");
        stock3.setQty(5);
        Stocks.add(stock3);



    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Map<Order> getOrders() {
//        return Orders;
//    }

    @POST @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Path("updateStock")
    public OrderResponse updateStock(final OrderRequest req){
        return null;
    }


    public static class OrderResponse {
        private Long orderId;
        private String productCode;
        private Boolean success;

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }
    }


    @XmlRootElement
    public static class OrderRequest {
        @XmlElement  String productCode;
        @XmlElement  Long orderId;
        @XmlElement int qty;

//        public String getProductCode() {
//            return productCode;
//        }
//
//        public void setProductCode(String productCode) {
//            this.productCode = productCode;
//        }
//
//        public Long getOrderId() {
//            return orderId;
//        }
//
//        public void setOrderId(Long orderId) {
//            this.orderId = orderId;
//        }
//
//        public int getQty() {
//            return qty;
//        }
//
//        public void setQty(int qty) {
//            this.qty = qty;
//        }
    }

}
