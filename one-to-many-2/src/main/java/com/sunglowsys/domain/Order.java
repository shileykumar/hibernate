package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_master")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private String orderDate;

    public Order() {
    }

    public Order(double amount, String orderDate) {
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.amount, amount) == 0 && Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, orderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
