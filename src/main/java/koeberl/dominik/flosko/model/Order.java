package koeberl.dominik.flosko.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name="customer_name")
    private String customerName;

    @Column( name = "customer_plz")
    private Integer customerPlz;
    @Column(name="customer_street")
    private String customerStreet;

    @Column(name="description")
    private String description;

    @Column(name="order_date")
    private LocalDate orderDate;

    public Order() {}

    public Order(String customerName, Integer customerPlz, String customerStreet, String description,  LocalDate orderDate) {
        this.customerName = customerName;
        this.customerPlz = customerPlz;
        this.customerStreet = customerStreet;
        this.description = description;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getCustomerPlz() {
        return customerPlz;
    }

    public String getCustomerStreet() {
        return customerStreet;
    }

    public String getDescription() {
        return description;
    }


    public LocalDate getOrderDate() {
        return orderDate;
    }
}
