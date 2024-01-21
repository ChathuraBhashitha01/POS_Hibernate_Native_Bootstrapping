package lk.ijse.thogakade.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "order")
public class Order{
    @Id
    @Column(name = "order_id")
    private String orderID;

    @Column(name = "order_time")
    private Timestamp orderTime;

    @Column(name = "cust_name")
    private String customerID;

    public Order() {
    }

    public Order(String orderID, Timestamp orderTime, String customerID) {
        this.orderID = orderID;
        this.orderTime = orderTime;
        this.customerID = customerID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderTime=" + orderTime +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
