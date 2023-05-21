package koeberl.dominik.flosko.service;

import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import koeberl.dominik.flosko.model.Order;
import koeberl.dominik.flosko.model.Status;
import koeberl.dominik.flosko.repository.OrderDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    private OrderDao orderDao;


    public OrderService (OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    @Transactional
    public void createOrder(Order order) {
        orderDao.createOrder(order);
    }

    public List<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }

    @Transactional
    public Order updateStatus(Integer id, Status status) {
        return orderDao.updateStatus(id, status);
    }






}
