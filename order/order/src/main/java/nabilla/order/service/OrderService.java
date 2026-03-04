package nabilla.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nabilla.order.model.Order;
import nabilla.order.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order createOrder(Order order){

        order.setTotal(order.getHarga() * order.getJumlah());

        return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}