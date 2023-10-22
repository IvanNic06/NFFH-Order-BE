package Order.Order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Order.Order.entities.Order;
import Order.Order.entities.OrderPart;
import Order.Order.repository.OrderPartRepository;
import Order.Order.repository.OrderRepository;
import Order.Order.requests.CreateOrderInput;
import Order.Order.response.CreateOrderResponse;
import Order.Order.service.OrderService;

@RestController
public class orderController {
    
    @Autowired
    public final OrderService orderService;
    public final OrderRepository orderrepo;
    
    
    public orderController(OrderService orderService, OrderRepository orderrepo) {
        this.orderService = orderService;
        this.orderrepo = orderrepo;
    }
    
    //ADD A PRODUCT 

    @PostMapping("/order")
	public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderInput createOrderInput){
		
		Order order = createOrderInput.ToOrder();

		this.orderService.create(order);

        CreateOrderResponse response = new CreateOrderResponse(true, String.valueOf(order.getId()));

        return new ResponseEntity<CreateOrderResponse>(response, HttpStatus.CREATED);

    }


    //GET ORDER LIST OF A SINGLE CUSTOMER

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrderByClientID(@RequestParam int id){
        
        List<Order> orderList = this.orderService.findByClient(id);
        
        return new ResponseEntity<List<Order>>(orderList, HttpStatus.OK);
    }



}
