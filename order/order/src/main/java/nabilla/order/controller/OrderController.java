package nabilla.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nabilla.order.model.Order;
import nabilla.order.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrder(){
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
    }
}