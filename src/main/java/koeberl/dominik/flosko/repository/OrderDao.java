package koeberl.dominik.flosko.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import koeberl.dominik.flosko.model.Order;
import koeberl.dominik.flosko.model.Status;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {

    private EntityManager entityManager;

    public OrderDao(EntityManager entityManager) {
        this.entityManager = entityManager;

    }

    public void createOrder(Order order) {
        entityManager.persist(order);
    }

    public List<Order> getAllOrders() {
        TypedQuery<Order> q = entityManager.createQuery(
                "select o from Order o",  Order.class);
        return q.getResultList();
    }

    public Order updateStatus(Integer id, Status status) {
        Order order = entityManager.find(Order.class, id);
        if (order != null) {
            order.setStatus(status);
            entityManager.merge(order);
        }
        return order;
    }


}
