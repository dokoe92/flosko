package koeberl.dominik.flosko.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="orders")
@Getter @Setter
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

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;


    public Order() {}

    public Order(String customerName, Integer customerPlz, String customerStreet, String description) {
        this.customerName = customerName;
        this.customerPlz = customerPlz;
        this.customerStreet = customerStreet;
        this.description = description;
    }

    @PrePersist
    public void prePersist() {
        this.orderDate = LocalDate.now();
        this.status = Status.OFFEN;
    }




}
