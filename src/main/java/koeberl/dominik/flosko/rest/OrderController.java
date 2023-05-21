package koeberl.dominik.flosko.rest;

import koeberl.dominik.flosko.model.Order;
import koeberl.dominik.flosko.model.Status;
import koeberl.dominik.flosko.repository.OrderDao;
import koeberl.dominik.flosko.service.OrderService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/auftrag")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);

    }
    @GetMapping("")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /*@GetMapping("/status/{id}")
    public ResponseEntity<Order> findById(@PathVariable Integer id) {
        Order order = orderService.findById(id);
        if (order == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(order);

    }*/

    @PutMapping("/status/{auftragId}")
    public ResponseEntity<Order> updateStatus(@PathVariable(name="auftragId") Integer id, @RequestBody Status status) {
        Order order = orderService.updateStatus(id, status);
        System.out.println(order);
        if (order == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(order);

    }



}
