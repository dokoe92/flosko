package koeberl.dominik.flosko.rest;

import koeberl.dominik.flosko.model.Order;
import koeberl.dominik.flosko.repository.OrderDao;
import koeberl.dominik.flosko.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auftrag")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

    @GetMapping("")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
